class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int prefix[] = new int[nums.length+1];
        prefix[0] = 0;
        for(int i=1;i<nums.length+1;i++){
            prefix[i] = prefix[i-1]+nums[i-1];
        }
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<prefix.length;i++){
            int remainder = Math.floorMod(prefix[i], k);
            h.put(remainder,h.getOrDefault(remainder,0)+1);
        }
        int count = 0;
        for(int x:h.values()){
            count += x*(x-1)/2;
        }
        return count;
    }
}