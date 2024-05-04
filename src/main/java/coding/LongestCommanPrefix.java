package coding;
class LongestCommanPrefix {
    public String longestCommonPrefix(String[] strs) {
        int shortestLength = Integer.MAX_VALUE;
        for (String s : strs) {
            shortestLength = Math.min(shortestLength, s.length());
        }

        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < shortestLength; i++) {
            char c = strs[0].charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != c) {
                    return ans.toString();
                }
            }
            ans.append(c);
        }
        return ans.toString();
    }
}