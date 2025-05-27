#Q-1:Maximum Ascending Subarray Sum?
  class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = nums[0];
        int currmax = nums[0];

        for(int i=1; i<nums.length; i++){
            if (nums[i-1] < nums[i]){
                currmax = currmax + nums[i];
            }
            else{
                max = Math.max(max, currmax);
                currmax = nums[i];
            }
        }
        
        max = Math.max(max, currmax);
        return max;
    }
}

#Q-2:Find Lucky Integer in an Array?
  class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> HM = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int ele = arr[i];

            if (HM.containsKey(ele)==true){
                HM.put(ele,HM.get(ele)+1);
            }
            else{
                HM.put(ele,1);
            }
        }

        int ans =-1;

        for(int key:HM.keySet()){
            if(HM.get(key)==key){
                ans = Math.max(ans,key);
            }
        }

        return ans;
    }
}
