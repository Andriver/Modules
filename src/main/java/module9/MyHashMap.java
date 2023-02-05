package module9;

class MyHashMap<K, V> {
    private int size = 5;
    int length = 0;
    int index = 0;
    NodesForMyHashMap<K, V>[] table;

    MyHashMap() {
        table = new NodesForMyHashMap[size];
    }

    @Override
    public int hashCode() {
        return this.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        NodesForMyHashMap<K, V> secondTable = table[size];
        if (this == obj)
            return true;
        else if (obj == null || obj.getClass() != getClass())
            return false;
        MyHashMap<K, V> myHashMap = (MyHashMap<K, V>) obj;
        return secondTable.getKey() == myHashMap && secondTable.getValue() == myHashMap;
    }

    public void put(K key, V value) {
        index = key.hashCode() % size - 1;

        if (table == null) {
            table = new NodesForMyHashMap[size];
            if (index == -1)
                index = key.hashCode() % size;
        }

        if (length <= size && index >= 0) {

            NodesForMyHashMap<K, V> firstTable = new NodesForMyHashMap<>(key, value);
            NodesForMyHashMap<K, V> secondTable = table[index];

            if (table[index] == null) {
                table[index] = firstTable; //finding an empty bucket
                length++;
            } else while (secondTable != null) {
                if (secondTable.getKey().equals(key)) {
                    secondTable.next = firstTable;  //replace object
                    table[index] = secondTable.next;
                    break;
                } else {
                    secondTable.next = firstTable; //keep a reference to the next object
                    break;
                }
            }
        } else {
            size *= 2;
            NodesForMyHashMap<K, V>[] newTable = new NodesForMyHashMap[size];
            for (int i = 0; i < size / 2; i++) {
                if (table[i] == null) {
                    table = newTable;
                    put(key, value);
                } else
                    newTable[i] = table[i];
            }
            table = newTable;
            put(key, value);
        }
    }

    public V get(K key) {
        V value = null;
        index = key.hashCode() % size - 1;
        NodesForMyHashMap<K, V> secondTable = table[index];
        while (secondTable != null) {
            if (secondTable.getKey().equals(key)) {
                value = secondTable.getValue();
                secondTable = secondTable.next;
            }
        }
        return value;
    }

    public Object remove(K key) {
        NodesForMyHashMap<K, V> removeTable = null;
        index = key.hashCode() % size - 1;
        NodesForMyHashMap<K, V> secondTable = table[index];
        if (secondTable.getKey().equals(key)) {
            removeTable = table[index];
            table[index] = null;
        }
        return removeTable.getKey() + "=" + removeTable.getValue();
    }

    public int size() {
        return length + 1;
    }

    public NodesForMyHashMap<K, V>[] clear() {
        length = 0;
        return table = null;
    }

    @Override
    public String toString() {
        StringBuilder write = new StringBuilder();
        if (table == null) {
            write.append("{").append("}");
            return write.toString();
        }
        for (int i = 0; i < size; i++) {
            NodesForMyHashMap<K, V> secondTable = table[i];
            if (secondTable != null) {
                write.append(secondTable.getKey()).append("=").append(secondTable.getValue()).append(", ");
            }
        }
        write.deleteCharAt(write.lastIndexOf(", "));
        String show = write.toString();
        return "{" + show.strip() + "}";
    }

    public static void main(String[] args) {
        MyHashMap<Integer, String> hashMap = new MyHashMap<>();
        hashMap.put(1, "Бармалей");
        hashMap.put(1, "Бегемот");
        hashMap.put(2, "Зефир");
        hashMap.put(3, "Рембо");
        hashMap.put(4, "Муха");
        System.out.println(hashMap);
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.size());
        System.out.println(hashMap.remove(1));
        System.out.println(hashMap);
        hashMap.clear();
        for (int i = 0; i < 100; i++) {
            hashMap.put(i, "test + " + i);
        }
        System.out.println(hashMap);
        System.out.println(hashMap.size());
    }
}