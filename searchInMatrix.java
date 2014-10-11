public class Solution {
    /**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(ArrayList<ArrayList<Integer>> matrix, int target) {
        if(matrix.size() == 0){
            return false;
        }
       int size = matrix.size();
       int length = matrix.get(0).size();
       int start = 0;
       int end = size*length-1;
       while(start <= end){
           int mid = (start+end)/2;
           if(matrix.get(mid/length).get(mid%length) == target){
               return true;
           }else if(matrix.get(mid/length).get(mid%length) < target){
               start = mid+1;
           }else{
               end = mid-1;
           }
       }
       return false;
    }
}

