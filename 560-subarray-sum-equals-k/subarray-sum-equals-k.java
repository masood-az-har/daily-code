class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> m = new HashMap<>();
        m.put(0,1);
        int runsum = 0;
        int count = 0;

        for(int i=0;i<nums.length;i++){
            runsum = runsum + nums[i];
            int current = runsum - k;
            if(m.containsKey(current)){
                count = count + m.get(current);
            }

            m.put(runsum,m.getOrDefault(runsum,0)+1);
        }
        return count;
    }
}