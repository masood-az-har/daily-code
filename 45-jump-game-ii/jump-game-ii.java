class Solution {
    public int jump(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int reach = 0;
        int count = 0;
        int jump = 0;
        for(int i=0;i<nums.length-1;i++){
            reach = Math.max(reach,i+nums[i]);
            if(i == jump){
                count++;
                jump = reach;
            }
        }
        return count;
    }
}