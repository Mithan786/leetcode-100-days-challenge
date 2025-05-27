class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;
        int ptr = nums.length - 1;

        while(start <= end){
            int ss = nums[start] * nums[start];  // square from start
            int ee = nums[end] * nums[end];      // square from end

            if(ss > ee){                         // compare squares
                ans[ptr] = ss;                   // place bigger square
                start++;                         // move start forward
            } else {
                ans[ptr] = ee;                   // place bigger square
                end--;                           // move end backward
            }

            ptr--;                               // fill next position
        }

        return ans;
    }
}

