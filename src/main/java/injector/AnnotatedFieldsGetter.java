package injector;

import annotations.InjectCache;

import java.lang.reflect.Field;
import java.util.List;

/**
 * Created by Aphex on 24.05.2016.
 */
public class AnnotatedFieldsGetter {
    public static List<Field> getAnnotatedFields(List<Field> fields, Class<?> type) {
        for (Field field : type.getDeclaredFields()) {
            if (field.isAnnotationPresent(InjectCache.class)) {
                fields.add(field);
            }
        }
        if (type.getSuperclass() != null) {
            fields = getAnnotatedFields(fields, type.getSuperclass());
        }
        return fields;
    }
}
