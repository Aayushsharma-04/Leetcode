class Solution {
    public long sumAndMultiply(int n) {
        long nonzeronumber = 0;
        int digitsum =0;
        while(n>0){
            int digit = n%10;
            if(digit !=0){
                nonzeronumber = nonzeronumber *10  + digit ;
            }
            digitsum += digit;
            n = n/10;
        }
        long temp = nonzeronumber;
        nonzeronumber =0;
        while(temp!=0){
            nonzeronumber = nonzeronumber * 10 + temp %10;
            temp = temp/10;
        }
        return nonzeronumber*digitsum;
    }
}