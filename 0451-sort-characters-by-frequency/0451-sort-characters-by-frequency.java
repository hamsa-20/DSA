class Solution {
    public String frequencySort(String s) {
        int[] freqCount = new int[128];
        for (char ch : s.toCharArray()) {
            freqCount[ch]++;
        }
        StringBuilder result = new StringBuilder();
        for (int outer = 0; outer < s.length(); outer++) {
            int max = 0, maxIndex = 0;
            for (int i = 0; i < 128; i++) {
                if (freqCount[i] > max) {
                    max = freqCount[i];
                    maxIndex = i;
                }
            }
            if (max == 0) break;
            for (int j = 0; j < max; j++) {
                result.append((char) maxIndex);
            }
            freqCount[maxIndex] = 0;
        }
        return result.toString();
    }
}