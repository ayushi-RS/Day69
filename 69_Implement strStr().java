class Solution {
    public int strStr(String haystack, String needle) {
        String temp ="";
        for(int i=0;i<=haystack.length();i++){
             temp = haystack.substring(0,i);
            if(temp.contains(needle)){
                return i-needle.length();
            }
        }
        return -1;
    }
}