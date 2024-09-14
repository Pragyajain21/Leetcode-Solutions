class Solution {
    public int longestSubarray(int[] nums) {
        int maxvalue = 0;
        int streak = 0;
        int result = 0;
        for(int num:nums){
            if(num>maxvalue){
                maxvalue= num;
                streak = 0;
                result = 0;
                
            }
            if(maxvalue == num)
            {
                
                streak++;

            }else
            streak = 0;
            result = Math.max(result,streak);
        }
        return result;
    }
}