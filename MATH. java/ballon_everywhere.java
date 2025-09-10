class Solution {
    public int maxInstance(String s) {
        // Code here
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;

        }
        int b = freq['b' - 'a'] / 1;
        int a = freq['a' - 'a'] / 1;
        int l = freq['l' - 'a'] / 2;
        int o = freq['o' - 'a'] / 2;
        int n = freq['n' - 'a'] / 1;

        return Math.min(b, Math.min(a, Math.min(l, Math.min(o, n))));

    }
}
