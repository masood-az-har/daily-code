class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> al = new ArrayList<>();
        int n = nums.length;
        int freq[] = new int[n+1];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i] >= 2){
                al.add(i);
            }
        }
        return al;
    }
}