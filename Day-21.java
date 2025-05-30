#Q-1:Single Element in a Sorted Array?
 class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        
        // Handle edge cases for very short arrays
        if(n == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[n - 1] != nums[n - 2]) return nums[n - 1];

        int start = 0;
        int end = n - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            // Ensure mid is not at edge to avoid index out of bounds
            if(mid > 0 && mid < n - 1){
                if(nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]){
                    return nums[mid];
                }

                // Check pattern to decide direction
                if((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || 
                   (mid % 2 == 1 && nums[mid] == nums[mid - 1])){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                // In case mid is at the boundary.
                break;
            }
        }

        return -1; // This should never be reached if input is valid
    }
}

#Q-2:Sort Colors?
  class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid <= high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if (nums[mid] == 1){
                mid++;
            }
            else{
                swap(nums,high,mid);
                high--;                
            }
        }
    }
    public void swap(int[] nums, int i, int j){
        int k = nums[i];
        nums[i]=nums[j];
        nums[j]= k;
    }
}
