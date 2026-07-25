class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> al = new ArrayList<>();
        while(n != 0){
            al.add(n % 10);
            n /= 10;
        }

        Collections.sort(al);

        int res = al.get(al.size()-1)*al.get(al.size()-2);
        return res;
    }
}