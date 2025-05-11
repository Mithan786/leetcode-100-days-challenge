#Day-1
#First Code
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}

#Day-1
#Second Code
class Solution {
    public boolean isPalindrome(int x) {
        int temp =x, sum =0;
        while (temp > 0 )
        {
            int rev = temp %10;
            sum = sum*10+ rev;
            temp = temp/10;
        }
        if (sum ==x)
        return true;
        else
        return false;
    }
}
