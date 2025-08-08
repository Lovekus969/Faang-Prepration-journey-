public class Kadne{
    
    public static void main(String [] args){
        int nums[] = { 4,1,-2,6,7};
        //find the max subarray sum 
        int finalsum = nums[0];
        int maxsum = nums[0];

        for( int i =1; i<nums.length;i++){
            maxsum = Math.max(nums[i], nums[i]+maxsum);
            finalsum = Math.max(maxsum, finalsum);
        }
        System.out.println("Final sum is "+ finalsum);
    }
}