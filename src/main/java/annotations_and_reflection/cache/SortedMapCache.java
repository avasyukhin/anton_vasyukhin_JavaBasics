package annotations_and_reflection.cache;

import annotations_and_reflection.annotations.Cache;

import java.util.TreeMap;
import java.util.SortedMap;

/**
 * Created by Aphex on 21.05.2016.
 */
@Cache(name = "SortedMap")
public class SortedMapCache implements AbstractCache<Integer, String> {
    SortedMap<Integer, String> container = new TreeMap<Integer, String>();

    public void put(Integer key, String value) {
        container.put(key, value);
    }

    public String get(Integer key) {
        return container.get(key);
    }
}
