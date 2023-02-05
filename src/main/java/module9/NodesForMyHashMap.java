package module9;

class NodesForMyHashMap <K,V> {
    final K key;
    V value;
    NodesForMyHashMap<K,V> next;
    NodesForMyHashMap(K key,V value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    public  K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
