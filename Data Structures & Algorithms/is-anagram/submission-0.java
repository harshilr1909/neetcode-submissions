class Solution {
    public boolean isAnagram(String s, String t) {
        int freqOfSrc[] = new int[26];
        int freqOfTarget[] = new int[26];
        if(s.length()!= t.length()){
            return false;
        }

        for(int i = 0;i<s.length();i++){
            freqOfSrc[s.charAt(i) - 'a']++;
            freqOfTarget[t.charAt(i) - 'a']++;
        }

        for(int i =0 ;i<freqOfSrc.length;i++){
            if(freqOfSrc[i] != freqOfTarget[i]){
                return false;
            }
        }

        return true;
    }
}
