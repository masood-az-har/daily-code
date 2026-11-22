class Solution {
    public boolean checkString(String s) {
     int index = 0;

     for(int i=0;i<s.length();i++){
        char c = s.charAt(i);
        if(c == 'a'){
            index = i;
        }
     }
     boolean flag = true;
     for(int i=0;i<s.length();i++){
        char c = s.charAt(i);
        if(c == 'b' && index > i){
            return false;
        }
     }
     return flag;   
    }
}