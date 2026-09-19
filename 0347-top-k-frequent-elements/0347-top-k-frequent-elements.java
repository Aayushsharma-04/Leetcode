import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     HashMap<Integer,Integer>map = new HashMap<>();
     for(int num : nums){
        map.put(num,map.getOrDefault(num,0) +1);
     }
     PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>((a,b) -> Integer.compare(a.getValue(),b.getValue()));
     for(Map.Entry<Integer,Integer> e : map.entrySet()){
        minHeap.add(e);

        if(minHeap.size() > k){
            minHeap.poll();
        }
     }
     int [] result = new int[k];
     for(int i =0; i<k;i++){
        result[i] = minHeap.poll().getKey();
     }
     return result;
    }
}