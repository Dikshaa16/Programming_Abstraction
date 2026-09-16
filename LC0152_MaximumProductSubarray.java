public class LC0152_MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int maxProduct = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }
            
            currentMax = Math.max(nums[i], currentMax * nums[i]);
            currentMin = Math.min(nums[i], currentMin * nums[i]);
            
            maxProduct = Math.max(maxProduct, currentMax);
        }
        
        return maxProduct;
    }
    
    public static void main(String[] args) {
        int[] nums1 = {2, 3, -2, 4};
        System.out.println("Maximum product: " + maxProduct(nums1)); // 6
        
        int[] nums2 = {-2, 0, -1};
        System.out.println("Maximum product: " + maxProduct(nums2)); // 0
        
        int[] nums3 = {-2, 3, -4};
        System.out.println("Maximum product: " + maxProduct(nums3)); // 24
    }
}
