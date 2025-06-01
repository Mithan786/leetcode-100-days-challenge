#Q-1:Trapping Rain Water?
  class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int [] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i=1; i<n; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        int [] rightMax = new int [n];
        rightMax[n-1] = height[n-1];
        
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        int ans = 0;
        for (int i=0; i<n; i++){
            ans += Math.min(leftMax[i],rightMax[i]) - height[i];
        }

        return ans;
    }
}

#Q-2:Find Target Indices After Sorting Array?
  class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int num = 0;      
        int tcount = 0;   

        for (int ele : nums) {
            if (ele == target) {
                tcount++;
            } else if (ele < target) {
                num++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        while (tcount > 0) {
            ans.add(num);
            num++;
            tcount--;
        }

        return ans;
    }
}

  
