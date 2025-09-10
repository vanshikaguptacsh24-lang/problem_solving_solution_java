class Solution {
    public int countWords(String list[], int n) {
        // code here
        HashMap<String, Integer> freqMap = new HashMap<>();
        for (String word : list) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);

        }
        int count = 0;
        for (int freq : freqMap.values()) {
            if (freq == 2) {
                count++;
            }
        }
        return count;
    }
}
