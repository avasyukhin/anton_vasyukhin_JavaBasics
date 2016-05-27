package annotations_and_reflection.injector;

import annotations_and_reflection.cache.MapCache;
import annotations_and_reflection.cache.SortedMapCache;

import java.util.List;

/**
 * Created by Aphex on 24.05.2016.
 */
public class CachesGetter {
    public static List<Class> getAllCaches(List<Class> caches) {
        caches.add(MapCache.class);
        caches.add(SortedMapCache.class);
        return caches;
    }
}
