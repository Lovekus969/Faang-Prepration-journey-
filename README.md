“Each line I read, each line I write — brings the G63 closer.”  (book by - Learning made easy java all in one ) 
This repo is going to be all about some Java code : 
17 -07-2025 



Q: When would you use a Hash Map over a Tree?
Use a HashMap when:
You need fast access to data using keys (O(1) average case).
The order of elements doesn't matter.
Example: looking up users by ID, counting word frequency, and caching.
Use a Tree (like BST) when:
You need a sorted order of elements.
You want to perform range queries (e.g., values between 10 and 50).
You need an ordered traversal (in-order, pre-order, etc.).
HashMap is faster for lookup, but Trees are better for maintaining order.

Q... Advantages of a Binary Search Tree (BST)
Allows fast lookup, insertion, and deletion in O(log n) time (when balanced). Supports sorted data and in-order traversal. Good for range queries (like get all elements between 10 and 50). Flexible – can be modified into AVL trees, Red-Black Trees, etc., for balancing. But if the tree becomes unbalanced (e.g., like a linked list), performance degrades to O(n).


Today we will see the most important problem named as N queen 
Intution is easy first we place the queen in rows and rhen cheack if it is safe then use backtrscking if not and place accordingly s
