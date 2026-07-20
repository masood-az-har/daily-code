class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c != '*'){
                st.push(c);
            }else{
                st.pop();
            }
        }

        String r = "";
        for(char x : st){
            r = r+x;
        }
        return r;
    }
}