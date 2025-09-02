class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0; // To store the maximum consecutive 1s
        int count = 0;    // To count current consecutive 1s
        
        for (int num : nums) {
            if (num == 1) {
                count++;               // Increment count if 1
                if (count > maxCount) {
                    maxCount = count; // Update maxCount
                }
            } else {
                count = 0; // Reset count if 0
            }
        }
        
        return maxCount;
    }
}
