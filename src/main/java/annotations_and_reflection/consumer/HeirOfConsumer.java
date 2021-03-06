package annotations_and_reflection.consumer;

import annotations_and_reflection.cache.AbstractCache;
import annotations_and_reflection.annotations.InjectCache;

/**
 * Created by Aphex on 21.05.2016.
 */
public class HeirOfConsumer extends Consumer {
    @InjectCache(name = "SortedMap")
    private AbstractCache<Integer, String> sortedmap_cache;

    public void putInSortedCache(Integer key, String value) {
        sortedmap_cache.put(key, value);
    }

    public String getFromSortedCache(Integer key) {
        return sortedmap_cache.get(key);
    }
}
