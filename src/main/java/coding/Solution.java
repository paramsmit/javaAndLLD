package coding;

class Solution {
    public boolean rotateString(String s, String goal) {

        StringBuilder sb = new StringBuilder(s);

        int n = sb.length();
        int i = 1;
        boolean ans = false;

        while(i < n){
            if(sb.toString().equals(goal)){
                ans = true;
                break;
            }
            i++;
            rotate(sb);
        }

        return ans;

    }

    public void rotate(StringBuilder sb){
        char first = sb.charAt(0);
        int n = sb.length();
        for(int i = 1; i < n; i++){
            sb.setCharAt(i-1, sb.charAt(i));
        }
        sb.setCharAt(n-1, first);
    }
}