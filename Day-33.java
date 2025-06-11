#Q-1: Find the Duplicate Number?
  class Solution {
    public int findDuplicate(int[] arr) {
        int hash[] = new int[arr.length +1];

        for(int i =0; i<arr.length; i++){
            if(hash[arr[i]] == 0){
                hash[arr[i]]++;
            } else{
                return arr[i];
            }
        }

        return -1;
      }
  }
