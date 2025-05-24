#Q-1
  class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int maxCap = 0;

        while (start < end){
            int h = Math.min(height[start], height[end]);
            int width = end - start;
            int currCap = h * width;

            maxCap = Math.max(currCap , maxCap);
            if (height[start] < height[end]){
                start++;
            }

            else{
                end--;
                
            }
        }

        return maxCap;
    }
}


#Q2
  class Solution {
    public boolean increasingTriplet(int[] nums) {
        int First = Integer.MAX_VALUE;
        int Second = Integer.MAX_VALUE;
        int Third = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++){

            int ele = nums[i];

            if(First >= ele){
                First = ele;
            }

            else if (Second >= ele){
                Second = ele; 
            }

            else{
                Third = ele;
                return true;
            }
        }
        return false;
    }
}
