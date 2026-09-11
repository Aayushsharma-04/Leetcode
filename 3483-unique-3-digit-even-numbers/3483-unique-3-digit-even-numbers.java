class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];
        for(int d : digits){
            freq[d]++;
        }

        HashSet<Integer> set = new HashSet<>();

        backtrack(freq,0,0,set);
        return set.size();
    }

    private void backtrack(int[] freq,int currentnum,int length,HashSet<Integer> set){
        if(length ==3){
            if(currentnum >=100 && currentnum %2 ==0){
                set.add(currentnum);
            }
            return;
        }

        for(int i =0; i<=9;i++){
            if(freq[i] >0){
                freq[i]--;
                backtrack(freq,currentnum *10 +i,length+1,set);

                freq[i]++;
            }
        }
    }
}