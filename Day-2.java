class Solution {
    public boolean isPowerOfTwo(int n) {
    // First Solution 
        // if (n<=0) return false;
        // while (n % 2 == 0){
        //     n/=2;
        // }
        // return n==1;
    
    // Second Solution
        if (n == 1) return true;
        if (n <= 0 || n % 2!= 0 ) return false;
        return isPowerOfTwo(n/2);
    }

}
