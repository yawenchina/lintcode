public class Solution {
    /**
     * @param numbers : Give an array numbers of n integer
     * @return : Find all unique triplets in the array which gives the sum of zero.
     */
    public ArrayList<ArrayList<Integer>> threeSum(int[] numbers) {
    
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(numbers == null && numbers.length  < 3){
            return result;
        }
        Arrays.sort(numbers);
        for(int i = 0; i < numbers.length-2; i++){
            if(i > 0 && numbers[i] == numbers[i-1])
                continue;
            int target = 0-numbers[i];
            int start = i+1;
            int end = numbers.length-1;
            while(start < end){
                if(numbers[start]+ numbers[end] == target){
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    temp.add(numbers[i]);
                    temp.add(numbers[start]);
                    temp.add(numbers[end]);
                    result.add(temp);
                    do{start++;}while(start < end && numbers[start] == numbers[start-1]);
                      do{end--;}while(start < end && numbers[end] == numbers[end+1]);
                }else if(numbers[start]+ numbers[end] < target){
                    start++;
                }else{
                    end--;
                }
                 
            }
        }
        return result;
    }
}
