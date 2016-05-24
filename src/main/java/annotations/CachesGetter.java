package annotations;

import annotations_test.MapCache;
import annotations_test.SortedMapCache;

import java.util.List;

/**
 * Created by Aphex on 24.05.2016.
 */
public class CachesGetter {
    public static List<Class> getAllCaches(List<Class> caches){
        caches.add(MapCache.class);
        caches.add(SortedMapCache.class);
        return caches;
    }
}
