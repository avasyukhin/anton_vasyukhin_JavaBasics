package annotations_test;

import annotations.AbstractCache;
import annotations.InjectCache;

/**
 * Created by Aphex on 21.05.2016.
 */
public class Consumer {
    @InjectCache(name = "Map")
    private AbstractCache<Integer,String> map_cache;

    public void putInCache(Integer key, String value){
        map_cache.put(key,value);
    }
    public String getFromCache (Integer key){
        return map_cache.get(key);
    }
}