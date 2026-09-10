class Solution {
    public int max(int[] weights){
        int largest=weights[0];
        for(int i=1;i<weights.length;i++){
            largest=Math.max(largest,weights[i]);
        }
        return largest;
    }


    public boolean checkCapacity(int[] weights,int capacity,int days){
        int total_days=1;
        // int count=0;
        int fin_capacity=0;
        int cur_capacity=0;
        for(int i=0;i<weights.length;i++){
            cur_capacity+=weights[i];
            if(cur_capacity<=capacity){
                fin_capacity=cur_capacity;
            }
            else{
                cur_capacity=0;
                cur_capacity=cur_capacity+weights[i];
                fin_capacity=cur_capacity;
                total_days++;
            }
        }
        if(total_days<=days){
            return true;
        }
        return false;
    }


    public int shipWithinDays(int[] weights, int days) {
        int high=0;
        int low=max(weights);
        for(int i=0;i<weights.length;i++){
            high=high+weights[i];
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(checkCapacity(weights,mid,days)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}