#Q-1:Bulb Switcher?
class Solution {
    public int bulbSwitch(int n) {
        if(n==0) return 0;
        int i=0;
        while(i*i<=n) i++;
        return i-1;
    }
}
