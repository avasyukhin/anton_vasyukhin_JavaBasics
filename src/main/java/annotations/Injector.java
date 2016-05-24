package annotations;

import annotations_test.MapCache;
import annotations_test.SortedMapCache;

import java.lang.annotation.Annotation;
import java.lang.annotation.AnnotationFormatError;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Aphex on 20.05.2016.
 */
public class Injector {
    public static void injectTo(Object instance){
        List<Field> fields = new ArrayList<Field>();
        List<Class> caches = new ArrayList<Class>();
        caches = CachesGetter.getAllCaches(caches);
        fields = AnnotatedFieldsGetter.getAnnotatedFields(fields, instance.getClass());
        try {
        for (Field field : fields) {
            field.setAccessible(true);
            String field_name = field.getAnnotation(InjectCache.class).name();
            //System.out.println(field.toString() + " --- " + name);
            Boolean implementation_not_found = true;
            for (Class<?> cache: caches) {
                //System.out.println(cache.toString() + " --- " + cache.getAnnotation(Cache.class).name());
                String implementation_name=cache.getAnnotation(Cache.class).name();
                if (field_name.equals(implementation_name)) {
                    implementation_not_found = false;
                    field.set(instance, cache.newInstance());
                    System.out.println("To field annotated as "+field_name+
                            " was injected implementation of AbstractCache annotated as "+implementation_name);
                    break;
                }
            }
            if (implementation_not_found){
                throw new TypeNotPresentException(Cache.class.getTypeName(),null);
            }

        }
        }catch (TypeNotPresentException e){
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
