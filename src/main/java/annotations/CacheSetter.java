package annotations;

import java.lang.reflect.Field;

/**
 * Created by Aphex on 24.05.2016.
 */
public class CacheSetter {
    public static void setCache(Class<?> cache, Object instance, Field field) throws IllegalAccessException, InstantiationException {
        if (cache.equals(null)) {
            throw new TypeNotPresentException(cache.getTypeName(), null);
        }
        field.set(instance, cache.newInstance());

    }
}
