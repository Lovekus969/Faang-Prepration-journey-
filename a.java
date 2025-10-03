import java.util.HashMap;

public class a {

    // Linear Search in an array
    public static void linearSearch(int[] arr, int target) {
        long start = System.nanoTime();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                break;
            }
        }

        long end = System.nanoTime();
        System.out.println("Linear Array Search Time: " + (end - start) + " ns");
    }

    // HashMap Search
    public static void hashMapSearch(HashMap<Integer, Integer> map, int target) {
        long start = System.nanoTime();

        int value = map.get(target); // O(1) average case

        long end = System.nanoTime();
        System.out.println("HashMap Search Time: " + (end - start) + " ns");
    }

    public static void main(String[] args) {
        int n = 1000000; // dataset size
        int target = n - 1; // element to search

        // Prepare array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        // Prepare HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i, i);
        }

        // Function calls
        linearSearch(arr, target);
        hashMapSearch(map, target);
    }
}
