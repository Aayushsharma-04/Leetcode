class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> list =  new ArrayList<>();
        backtrack(n,k,1,new ArrayList<>(),list);
        return list;
    }
    private void backtrack(int n,int k ,int sum, List<Integer> current,List<List<Integer>> list){
        if( current.size() ==k ){
            if(n ==0){
            list.add( new ArrayList<>(current));
            }
            return;
        }

        for(int i = sum ; i <=9;i++){
            if(i > n){
                return;
            }
            current.add(i);
            backtrack(n - i ,k,i +1,current,list);
            current.remove(current.size() -1);
        }
        
    }
}