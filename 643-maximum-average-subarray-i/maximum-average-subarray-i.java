class Solution {
    public double findMaxAverage(int[] nums, int k) {
       double result = Integer.MIN_VALUE;
       int pointer = 0;
       int running = 0;
       for(int i=0;i<nums.length;i++){
        running += nums[i];
        if(i-pointer+1 >= k){
            double cal = (double)running/k;
            result = Math.max(result,cal);
            running -= nums[pointer];
            pointer++;
        }

       }

       return result;
    }
}