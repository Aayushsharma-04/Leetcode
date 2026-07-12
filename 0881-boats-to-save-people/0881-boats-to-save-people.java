class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count =0;
        int  i  =0;
        int m= people.length - 1 ;
        while(i <=m){
            if(i ==m){
                count++;
                break;
            }
          else  if (people[i] + people[m] <=limit){
                i++;
                m--;
                count++;
            }
            else{
                m--;
                count++;
            }
        }
        return count;
    }
}