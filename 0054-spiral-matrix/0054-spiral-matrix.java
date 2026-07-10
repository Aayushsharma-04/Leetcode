class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer>list = new ArrayList<>();
        int left =0 ,top = 0;
        int bottom = matrix.length -1 , right = matrix[0].length -1;

        while(top <=bottom && left <= right){
            for(int i = left; i<=right;++i){
                list.add(matrix[top][i]);
            }
            top++;

            for(int j =top; j<=bottom;++j){
                list.add(matrix[j][right]);
            }
            right--;
        

        if(top <= bottom){
            for(int i = right;i>= left;--i){
                list.add(matrix[bottom][i]);
            }bottom --;
        }
        if(left <= right){
            for(int i = bottom ;i>=top;--i){
                list.add(matrix[i][left]);

            }left++;
        }
        }
        return list;
    }
}