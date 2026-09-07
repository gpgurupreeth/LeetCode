class Solution {
    public int max(int[] piles){
        int temp=piles[0];
        for(int i=1;i<piles.length;i++){
            temp=Math.max(temp,piles[i]);
        }
        return temp;
    }

    public long hourCount(int[] piles,int mid){
        long totalhours=0;
        for(int i=0;i<piles.length;i++){   
            totalhours=totalhours+(int)Math.ceil((double)piles[i]/mid);
        }
        return totalhours;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=max(piles);
        while(low<=high){
            int mid=low+(high-low)/2;
            long total=hourCount(piles,mid);
            if(total<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;   
    }
}