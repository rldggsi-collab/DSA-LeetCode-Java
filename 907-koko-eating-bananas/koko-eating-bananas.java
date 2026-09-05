class Solution {
    public int speed(int[] piles, int h, int low, int high){
        int res = -1;
        while(low<=high){
            int mid = (low+high)/2;
            long hours = 0;
                for(long i : piles){
                    hours+=(i+mid-1)/mid;
                } 
                if(hours<=h){
                    res = mid;
                    high = mid-1;
                } else{
                     low = mid+1;
                }
        }
        return res;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = piles[0];
        for(int x : piles){
            max = Math.max(max,x);
        }
        int min = speed(piles,h,1,max);

        return min;
    }
}