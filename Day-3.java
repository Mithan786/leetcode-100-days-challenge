#Q-1:Fibonacci Number?
class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        int FirstTerm = 0;
        int SecondTerm = 1;
        for (int i = 1; i<=n; i++)
        {
            int ThirdTerm = FirstTerm + SecondTerm;
            FirstTerm = SecondTerm;
            SecondTerm = ThirdTerm;
        }
        return FirstTerm;
    }
}

#Q-2:N-th Tribonacci Number?
class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1 || n==2){
            return 1;
        }
        int FirstTerm = 0;
        int SecondTerm = 1;
        int ThirdTerm = 1;

        for (int i = 1; i <= n; i++){
            int ForthTerm = FirstTerm + SecondTerm + ThirdTerm;

            FirstTerm = SecondTerm;
            SecondTerm = ThirdTerm;
            ThirdTerm = ForthTerm;
        }
        return FirstTerm;
    }
}
