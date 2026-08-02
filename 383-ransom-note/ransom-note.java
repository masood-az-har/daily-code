class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
     int freq[] = new int[26];
     int req[] = new int[26];
     for(int i=0;i<ransomNote.length();i++){
        char c = ransomNote.charAt(i);
        freq[c-'a']++;
     }
     for(int i=0;i<magazine.length();i++){
        char c = magazine.charAt(i);
        req[c-'a']++;
     }

     for(int i=0;i<freq.length;i++){
        if(freq[i] > req[i]){
            return false;
        }
     }
     return true;   
    }
}