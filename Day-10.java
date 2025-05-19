class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;
        int ptr = nums.length - 1;

        while(start <= end){
            int ss = nums[start] * nums[start];
            int ee = nums[end] * nums[end];

            if(st>ed){
                ans[ptr] = st;
                start++;
            }
            else{
                ans[ptr] = ed;
                end--;
            }
            
            ptr--;
        }

        return ans;
    }
}
