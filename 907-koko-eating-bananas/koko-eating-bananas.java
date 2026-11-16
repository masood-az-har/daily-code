class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        for(int i=0;i<piles.length;i++){
            right = Math.max(piles[i],right);
        }

        while(left < right){
            int mid = left + (right - left)/2;

            long hours = 0;

            for(int i=0;i<piles.length;i++){
                hours = hours+(piles[i]-1L)/mid+1;
            }

            if(hours<=h){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return right;
    }
}