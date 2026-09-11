class Solution {
    public int findKthPositive(int[] arr, int k) {
        int num=1;
        int res=0;
        int reduce=k;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==num){
        //         num++;
        //         continue;
        //     }
        //     if(arr[i]!=num){
        //         res=num;
        //         reduce--;
        //         if(reduce==0){
        //             return res;
        //         }
        //         num++;
        //     }
        // }
        int i=0;
        while(reduce!=0){
            if(i<arr.length && arr[i]==num){
                i++;
                num++;
                continue;
            }
            res=num;
            num++;
            reduce--;
        }
        return res;
    }
}