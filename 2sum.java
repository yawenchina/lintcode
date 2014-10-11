public class Solution {
    /*
     * @param numbers : An array of Integer
     * @param target : target = numbers[index1] + numbers[index2]
     * @return : [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> set = new HashMap<Integer,Integer>();
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        for(int i = 0; i < numbers.length; i++){
            if(set.containsKey(target - numbers[i])){
                result[0] = set.get(target-numbers[i]);
                result[1] = i+1;
            }else{
                set.put(numbers[i],i+1);
            }
        }
        return result;
    }
}
