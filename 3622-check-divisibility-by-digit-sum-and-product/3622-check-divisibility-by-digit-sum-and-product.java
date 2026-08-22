class Solution {
    public boolean checkDivisibility(int n) {
        int divisible =n;
        int sumofdigit =0;
        int productofdigit =1;
        while(n >0){
            int digit = n % 10;
            sumofdigit += digit;
            productofdigit *= digit;
            n /= 10;
        }

        boolean isDivisibleBy = ( divisible % (sumofdigit + productofdigit) ==0);
        
        return isDivisibleBy;
    }
}