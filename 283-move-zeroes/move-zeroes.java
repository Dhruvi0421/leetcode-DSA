class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroIndex = 0; // Position to place the next non-zero element
        
        // Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroIndex] = nums[i];
                lastNonZeroIndex++;
            }
        }
        
        // Fill remaining positions with 0
        for (int i = lastNonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
