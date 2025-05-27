#Q-1:Search in Rotated Sorted Array?
  class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            else if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            // Right half is sorted
            else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}


#Q-2: Find Minimum in Rotated Sorted Array?
  class Solution {
    public int findMin(int[] nums) {
        if(nums.length ==1){
            return nums[0];
        }
        else if (nums[0]<nums[nums.length-1]) {
            return nums[0];
        }

        int start = 0;
        int end = nums.length-1;

        while (start<=end){
            int mid = (start + end)/2;

            if (mid!=0 && nums[mid-1]>nums[mid]){
                return nums [mid];
            }
            else if(mid!=nums.length-1 && nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            else if (nums[start] <= nums[mid]){
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        
        return -1;
    }
}

