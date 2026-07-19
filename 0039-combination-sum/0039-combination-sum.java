class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
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
            current.add(candidates[i]);
            backtrack(candidates,i,target - candidates[i],current,list);
            current.remove(current.size() - 1);
        }

    }
}