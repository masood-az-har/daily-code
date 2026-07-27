class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int res = 0;

        Arrays.sort(nums);

        for(int i=1;i<nums.length;i++){
            int diff = nums[i]-nums[i-1];
            res = Math.max(res,diff);
        }

        return res;
    }
}