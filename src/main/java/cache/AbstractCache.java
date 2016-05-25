package cache;

/**
 * Created by Aphex on 20.05.2016.
 */
public interface AbstractCache<K, V> {
    V get(K key);

    void put(K key, V value);
}
