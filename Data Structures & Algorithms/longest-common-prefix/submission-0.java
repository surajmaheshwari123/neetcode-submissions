class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        for (int i=0;i<strs.length;i++){
            if(strs[i].length()<s.length()){
                s = strs[i];
            }
        }
        int min = s.length();
        for (int i=0;i<strs.length;i++){
            int minmin = 0;
            for (int j=0;j<s.length();j++){
                if(strs[i].charAt(j) == s.charAt(j)){
                    minmin++;
                }
                else{
                    break;
                }
            }
                                min = Math.min(min,minmin);
        }

    return s.substring(0, min);
    }
}