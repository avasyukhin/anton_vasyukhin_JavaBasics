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
    public static void injectTo(Object instance) {
        List<Field> fields = new ArrayList<Field>();
        List<Class> caches = new ArrayList<Class>();
        caches = CachesGetter.getAllCaches(caches);
        fields = AnnotatedFieldsGetter.getAnnotatedFields(fields, instance.getClass());

        for (Field field : fields) {
            field.setAccessible(true);
            Class cache = CacheFinder.findCache(field, caches, instance);
            try {
                CacheSetter.setCache(cache, instance, field);
                System.out.println("Implementation successfully injected");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (TypeNotPresentException e) {
                e.printStackTrace();
            }
        }
    }

}


