class Solution {
    // public int findMax(int[] bloomDay){
    //     int max=bloomDay[0];
    //     for(int i=1;i<bloomDay.length;i++){
    //         max=Math.max(max,bloomDay[i]);
    //     }
    //     return max;
    // }

    // public int findMin(int[] bloomDay){
    //     int min=bloomDay[0];
    //     for(int i=1;i<bloomDay.length;i++){
    //         min=Math.min(min,bloomDay[i]);
    //     }
    //     return min;
    // }

    public boolean blooms(int[] bloomDay,int mid,int m,int k){
        int total_count=0;
        int count=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                count++;
            }
            else{
                total_count=total_count+(count/k);
                count=0;
            }
        }
        total_count=total_count+(count/k);
        if(total_count>=m){
            return true;
        }
        return false;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<(long)m*k){
            return -1;
        }
        int low=bloomDay[0];
        int high=bloomDay[0];
        for(int i=0;i<bloomDay.length;i++){
            low=Math.min(low,bloomDay[i]);
            high=Math.max(high,bloomDay[i]);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(blooms(bloomDay,mid,m,k)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}