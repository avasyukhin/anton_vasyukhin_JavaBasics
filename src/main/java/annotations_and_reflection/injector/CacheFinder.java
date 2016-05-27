package annotations_and_reflection.injector;

import annotations_and_reflection.annotations.Cache;
import annotations_and_reflection.annotations.InjectCache;

import java.lang.reflect.Field;
import java.util.List;

/**
 * Created by Aphex on 24.05.2016.
 */
public class CacheFinder {
    public static Class findCache(Field field, List<Class> caches, Object instance) {
        String fieldName = field.getAnnotation(InjectCache.class).name();
        for (Class<?> cache : caches) {
            String implementationName = cache.getAnnotation(Cache.class).name();
            if (fieldName.equals(implementationName)) {
                System.out.println("To field annotated as " + fieldName +
                        " found implementation of AbstractCache annotated as " + implementationName);
                return cache;
            }
        }
        return null;
    }
}
