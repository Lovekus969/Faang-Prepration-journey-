public class KadaneAlgorithm {

    public static int maxSubarraySum(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum; // Works for mixed numbers and all-negative arrays
    }

    public static void main(String[] args) {
        int[] arr1 = {1, -2, 3, 4, -1}; // Mixed
        int[] arr2 = {-5, -1, -8, -9};  // All negative

        System.out.println("Max Subarray Sum (arr1): " + maxSubarraySum(arr1));
        System.out.println("Max Subarray Sum (arr2): " + maxSubarraySum(arr2));
    }
}
