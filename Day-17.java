#Q-1
  class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start<=end){
            int mid = (start + end)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if (target  > nums[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}

#Q-2
  class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        if (nums.length == 0) {
            return ans;
        }

        ans[0] = firstOccurrence(nums, target);
        ans[1] = lastOccurrence(nums, target);

        return ans;
    }

    public int firstOccurrence(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                ans = mid;
                end = mid - 1; // continue searching on the left
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }

    public int lastOccurrence(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                ans = mid;
                start = mid + 1; // continue searching on the right
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }
}
