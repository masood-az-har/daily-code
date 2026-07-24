class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> h = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char [] temp = strs[i].toCharArray();
            Arrays.sort(temp);

            String k = new String(temp);

            if(!h.containsKey(k)){
                h.put(k,new ArrayList<>());
            }
             h.get(k).add(strs[i]); 
        }
        List<List<String>> res = new ArrayList<>();
        for(ArrayList<String> g : h.values()){
            res.add(g);
        }

        return res;
    }
}