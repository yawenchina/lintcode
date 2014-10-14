public class Solution {
    /**
     * @param nums: The integer array
     * @return: The length of LIS (longest increasing subsequence)
     */
    public int longestIncreasingSubsequence(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int[] number = new int[nums.length];
        Arrays.fill(number,1);
        int max = 0;
        for(int i = 1 ; i < nums.length; i++){
            
            for(int j = 0; j < i ; j++){
                if(nums[i] >= nums[j]){
                    number[i] = Math.max(number[i], number[j]+1);
                }
              
            }
                max = Math.max(max, number[i]);
            
            
        }
        return max;
    }
}

