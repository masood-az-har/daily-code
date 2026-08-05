class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashSet<Integer> hs = new HashSet<>();

        for(int x : nums){
            hs.add(x);
            min = Math.min(min,x);
            max = Math.max(max,x);
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