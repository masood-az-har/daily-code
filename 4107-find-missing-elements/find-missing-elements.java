class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();
        HashSet<Integer> hs = new HashSet<>();

        for(int x : nums){
            hs.add(x);
        }
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=min+1;i<max;i++){
            if(!hs.contains(i)){
                al.add(i);
            }
        }
        return al;
    }
}