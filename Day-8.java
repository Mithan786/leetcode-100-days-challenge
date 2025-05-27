#Q-1:Missing Number?
class Solution {
    public int missingNumber(int[] nums) {
        int range = nums.length;
        int actualSums = (range * (range + 1))/2;
        int currentSums = 0;
        for (int i=0; i<nums.length; i++){
            currentSums = currentSums + nums[i];
        }
        int ans = actualSums - currentSums;
        return ans;
    }
}
