# Faang-Prepration-journey-
Comprehensive collection of FAANG interview preparation material including coding problems, data structures, algorithms, and notes
# HashMap in Java - Detailed Information

### Introduction
A **HashMap** in Java is a data structure that allows us to store key-value pairs, where each key is unique, and each key is associated with one value. It is part of the `java.util` package and implements the `Map` interface.

---

### Key Features of HashMap
- **Key-Value Pair**: A `HashMap` stores data as key-value pairs.
- **Unique Keys**: Each key must be unique, but values can be duplicated.
- **Null Keys and Values**: HashMap allows one `null` key and any number of `null` values.
- **Order of Entries**: The order of elements in a HashMap is not guaranteed (unordered). If you want insertion order, use `LinkedHashMap`.
- **Non-Synchronized**: It is not thread-safe by default. Use `ConcurrentHashMap` if you need thread safety.
- **Time Complexity**: Average-case time complexity for `put()`, `get()`, and `remove()` is **O(1)**.

---

### Common Methods of HashMap

| Method                   | Description                                 |
|--------------------------|---------------------------------------------|
| `put(K key, V value)`     | Adds a key-value pair to the map.           |
| `get(K key)`              | Returns the value associated with the key.  |
| `containsKey(K key)`      | Checks if a key exists in the map.          |
| `containsValue(V value)`  | Checks if a value exists in the map.        |
| `remove(K key)`           | Removes the key-value pair for the given key. |
| `getOrDefault(K key, V defaultValue)` | Returns the value if the key exists; otherwise, returns the default value. |
| `clear()`                 | Removes all key-value pairs from the map.   |
| `size()`                  | Returns the number of key-value pairs in the map. |

---

### Time Complexity of HashMap Operations
| Operation     | Time Complexity |
|---------------|-----------------|
| `put()`       | O(1)            |
| `get()`       | O(1)            |
| `remove()`    | O(1)            |
| `containsKey()` | O(1)          |
| `containsValue()` | O(n)         |

- **Note**: Worst-case time complexity can be O(n) if there are hash collisions (e.g., all keys hash to the same bucket), but Java's HashMap implementation minimizes this with rehashing.

---

### Common Use Cases of HashMap
1. **Counting Frequency of Elements**:
   HashMap is often used to count the frequency of elements in an array or list.

   ```java
   int[] nums = {1, 2, 1, 3, 2, 1};
   HashMap<Integer, Integer> freqMap = new HashMap<>();

   for (int num : nums) {
       freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
   }

   System.out.println(freqMap); // Output: {1=3, 2=2, 3=1}

