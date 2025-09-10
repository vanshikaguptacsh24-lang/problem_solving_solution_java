class Solution {
    // Function to find largest number with minimum frequency
    public static int LargButMinFreq(int arr[], int n) {
        // Your code here
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

        }
        int minFreq = Integer.MAX_VALUE;
        for (int freq : freqMap.values()) {
            minFreq = Math.min(minFreq, freq);

        }
        int result = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == minFreq) {
                result = Math.max(result, entry.getKey());
            }
        }
        return result;
    }
}
