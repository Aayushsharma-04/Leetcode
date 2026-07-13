class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeSet<Integer> Sorted = new TreeSet<>();
        for(int num: arr){
            Sorted.add(num);
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int rank =1;
        for(int num : Sorted){
            map.put(num,rank++);
        }
        int[] result = new int[arr.length];
        for(int i =0;i<result.length;i++){
            result[i] = map.get(arr[i]);
        }
        return result;

    }
}