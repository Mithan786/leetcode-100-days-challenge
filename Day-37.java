#Q-1: Length of Last Word?
  class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;

        for (int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);

            if(ch!= ' '){
                count ++;
            }
            else if (count!=0){
                break;
            }
        }
        return count;
    }
}
