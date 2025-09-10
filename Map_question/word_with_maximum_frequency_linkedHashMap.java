class Solution {
    public String maximumFrequency(String s) {
        // Your Code goes here

        String[] words = s.split(" ");
        Map<String, Integer> map = new LinkedHashMap<>();
        int max = 0;
        String ans = " ";

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (String word : words) {
            if (map.get(word) > max) {
                max = map.get(word);
                ans = word + " " + max;
            }
        }

        return ans;

    }
}
