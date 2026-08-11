class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n)) {
            set.add(n);
            n = getnext(n);
        }
        return n ==1;
    }

    private int getnext(int n){
        int num = 0;
        while(n >0){
            int digit = n %10;
            num += digit * digit;
            n/= 10;
        }
        return num;
}
}