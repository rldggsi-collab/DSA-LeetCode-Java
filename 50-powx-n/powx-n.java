class Solution {
    public double pow(double x, long n) {
        if(n == 0){
            return 1;
        }
        if(n==1){
            return x;
        }
        if(n%2 == 0) {
            return pow(x * x, n / 2);
        } else{
        return x * pow(x, n - 1);
        }
    }
    public double sol(double x, int n){
        long num = n;
        if(n>0){
            return pow(x,num);
        }else{
        return 1.0/pow(x,-num);
        }
    }
    public double myPow(double x, int n) {
        
        double ans = sol(x, n);
        return ans;
    }
}