class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> m = new HashMap<>();
        int count = 0;

        for(int i=0;i<nums.length;i++){
            int freq = m.getOrDefault(nums[i],0);
            count = count+freq;
            m.put(nums[i],freq+1);
        }
        return count;
    }
}