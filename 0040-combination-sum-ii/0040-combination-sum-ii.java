class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates,0,target,new ArrayList<>(),list);
        return list;
    }
    private void backtrack(int[] candidates,int index,int target,List<Integer> current,List<List<Integer>>list){
        if(target ==0){
            list.add(new ArrayList<> (current));
            return ;
        }
        if(target<0){
            return;
        }

        for(int i =index ;i<candidates.length;i++){
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
               }            
               current.add(candidates[i]);
            backtrack(candidates,i+1,target - candidates[i],current,list);
            current.remove(current.size() - 1);
        }

    }
    
}