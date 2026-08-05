class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int x : nums){
            al.add(x);
        }
        for(int i=min;i<=max;i++){
            if(!al.contains(i)){
                al.add(i);
            }else{
                al.remove(Integer.valueOf(i));
            }
        }
        return al;
    }
}