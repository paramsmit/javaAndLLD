package coding;

public class Find_The_Index_FIrst_Occurence {
    public int strStr(String haystack, String needle) {

        needle.split();

        int window = needle.length();
        int n = haystack.length();
        int ans = -1;
        for(int i = 0; i <= n-window; i++){
            if(haystack.substring(i, i+window).equals(needle)){
                ans = i;
                break;
            }
        }
        return ans;
    }
}
