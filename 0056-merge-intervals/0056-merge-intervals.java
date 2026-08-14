class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            int result=Integer.compare(a[0],b[0]);
            if(result==0){
                result=Integer.compare(a[1],b[1]);
            }
            return result;
        });
        int initial=0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[initial][1]>=intervals[i][0]){
                intervals[initial][1] = Math.max(intervals[initial][1], intervals[i][1]);
            }
            else{
                initial++;
                intervals[initial] = intervals[i];
            }
        }
        return Arrays.copyOf(intervals, initial + 1);

    }
}