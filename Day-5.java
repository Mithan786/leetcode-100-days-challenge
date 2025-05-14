#First way to solve
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
     List<Integer> ans = new ArrayList<>();
     int i = num.length -1;
     int carry = 0;
     while (i >= 0 || k > 0){
        int sum = carry;
        if(i>=0){
            sum += num [i--];
        }
        if (k >0){
            sum += k%10;
            k/=10;
        }
        ans.add(sum%10);
        carry = sum / 10;
     }   
     if (carry > 0){
        ans.add(carry);
        }
        Collections.reverse(ans);
        return ans;
    }
}

#Second way to solve
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int n = num.length;
        int carry = k;

        for (int i = n - 1; i >= 0 || carry > 0; i--) {
            if (i >= 0) {
                carry += num[i];
            }
            ans.add(0, carry % 10);
            carry /= 10;
        }
        
        return ans;
    }
}
