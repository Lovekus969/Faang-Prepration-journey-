# Faang-Prepration-journey-
Comprehensive collection of FAANG interview preparation material including coding problems, data structures, algorithms, and notes
# HashMap in Java - Detailed Information

### Introduction
HashMap is a powerful and versatile data structure in Java, providing constant time complexity for most operations like insertion, deletion, and lookups. Understanding its methods, time complexities, and common use-cases is crucial for solving real-world problems, especially in FAANG-style interviews.

A **HashMap** in Java is a data structure that allows us to store key-value pairs, where each key is unique, and each key is associated with one value. It is part of the `java.util` package and implements the `Map` interface.

---

### Key Features of HashMap
- **Key-Value Pair**: A `HashMap` stores data as key-value pairs.
- **Unique Keys**: Each key must be unique, but values can be duplicated.
- **Null Keys and Values**: HashMap allows one `null` key and any number of `null` values.
- **Order of Entries**: The order of elements in a HashMap is not guaranteed (unordered). If you want insertion order, use `LinkedHashMap`.
- **Non-Synchronized**: It is not thread-safe by default. Use `ConcurrentHashMap` if you need thread safety.
- **Time Complexity**: Average-case time complexity for `put()`, `get()`, and `remove()` is **O(1)**.


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

COncept of fileter
      const numbers = [1, 2, 3, 4, 5];
      const evenNumbers = numbers.filter(num => num % 2 === 0);
      
      console.log(evenNumbers); // [2, 4]
2-Month FAANG DSA Prep Plan
(From June 6 to August 6, full beast mode 🔥

Today is june 17 
-----------------------------Binary Tree Basics (FAANG Style)✅ Properties---------------------------------------
Each node has at most 2 children: left and right.

The top node is called the root.

A node with no children is called a leaf.

Height = longest path from root to a leaf.**

Todays 14 july  Watch List:
✅ Graph Representation (Adjacency List / Matrix)

✅ DFS & BFS (Recursive + Iterative)

✅ Cycle Detection (Directed + Undirected)

✅ Topological Sort (Kahn’s Algo + DFS version)

✅ Dijkstra’s Algorithm

✅ Prim’s & Kruskal’s (MST)

✅ Disjoint Set Union (DSU)
We will see some traversal in java 
inorder , postorder and preorder traversal in java 
This project implements basic binary tree traversals (Inorder, Preorder, Postorder) in Java.

## How to run

Compile and run `Faang.java`:
