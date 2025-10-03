class LinearProbingHashMap {
    private int capacity;
    private int size;
    private Integer[] table;

    // Constructor
    public LinearProbingHashMap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.table = new Integer[capacity];
    }

    // Hash function
    private int hash(int key) {
        return key % capacity;
    }

    // Put key into the table
    public void put(int key) {
        if (size == capacity) {
            System.out.println("Hash Table is full!");
            return;
        }

        int index = hash(key);
        while (table[index] != null && !table[index].equals(key)) {
            index = (index + 1) % capacity; // Linear Probing
        }

        if (table[index] == null) {
            size++;
        }
        table[index] = key;
    }

    // Check if key exists
    public boolean contains(int key) {
        int index = hash(key);
        int startIndex = index;

        while (table[index] != null) {
            if (table[index].equals(key)) {
                return true;
            }
            index = (index + 1) % capacity;
            if (index == startIndex) break; // full loop
        }
        return false;
    }

    // Remove key
    public void remove(int key) {
        int index = hash(key);
        int startIndex = index;

        while (table[index] != null) {
            if (table[index].equals(key)) {
                table[index] = null;
                size--;
                rehash(); // important for linear probing
                return;
            }
            index = (index + 1) % capacity;
            if (index == startIndex) break;
        }
        System.out.println("Key " + key + " not found!");
    }

    // Rehash table after removal
    private void rehash() {
        Integer[] oldTable = table;
        table = new Integer[capacity];
        size = 0;

        for (Integer key : oldTable) {
            if (key != null) {
                put(key);
            }
        }
    }

    // Print table
    public void printTable() {
        System.out.print("Hash Table: ");
        for (int i = 0; i < capacity; i++) {
            System.out.print((table[i] == null ? "null" : table[i]) + " ");
        }
        System.out.println();
    }
}

public class Main2 {
    public static void main(String[] args) {
        LinearProbingHashMap map = new LinearProbingHashMap(7);

        // Put
        map.put(10);
        map.put(20);
        map.put(30);
        map.put(17); // collision with 10 if capacity=7
        map.printTable();

        // Contains
        System.out.println("Contains 20? " + map.contains(20));
        System.out.println("Contains 25? " + map.contains(25));

        // Remove
        map.remove(20);
        map.printTable();

        map.remove(25); // not found
    }
}
