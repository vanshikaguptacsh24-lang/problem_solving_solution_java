class Solution {
    public String reverseString(String s) {
        // code here.
        boolean[] seen = new boolean[256];
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (ch != ' ' && !seen[ch]) {
                sb.append(ch);
                seen[ch] = true;
            }
        }
        return sb.toString();
    }
}
