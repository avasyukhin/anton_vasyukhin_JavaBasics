package annotations_and_reflection.cache;


import annotations_and_reflection.annotations.Cache;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aphex on 21.05.2016.
 */
@Cache(name = "Map")
public class MapCache implements AbstractCache<Integer, String> {
    Map<Integer, String> container = new HashMap<Integer, String>();

    public void put(Integer key, String value) {
        container.put(key, value);
    }

    public String get(Integer key) {
        return container.get(key);
    }
}
