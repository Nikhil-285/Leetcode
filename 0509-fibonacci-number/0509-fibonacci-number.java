class Solution {
    public int fib(int n) {
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        int fnm1=fib(n-1);
        int fnm2=fib(n-2);
        int fibn=fnm1+fnm2;
        return fibn;
    }
}