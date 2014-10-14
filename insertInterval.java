/**
 * Definition of Interval:
 * public classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 */

class Solution {
    /**
     * Insert newInterval into intervals.
     * @param intervals: Sorted interval list.
     * @param newInterval: A new interval.
     * @return: A new sorted interval list.
     */
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<Interval>();
        int position = 0;
        for(Interval one : intervals){
            if(one.end < newInterval.start){
                result.add(one);
                position++;
            }else if(one.start > newInterval.end){
                result.add(one);
            }else{
                newInterval = new Interval(Math.min(newInterval.start,one.start),Math.max(newInterval.end,one.end));
               
                
            }
           
            
        }
         result.add(position,newInterval);
        return result;
    }
}
