class Solution {
    public static String[] findRelativeRanks(int[] score) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for ( int i = 0; i < score.length; i++) {
            map.put(score[i], i);
        }
        Arrays.sort(score);
        String[] str = new String[score.length];
        for ( int i = score.length-1; i >= 0; i--) {
            if ( i == score.length-1) {
                str[map.get(score[i])] = "Gold Medal";
            }
            else if ( i == score.length-2) {
                str[map.get(score[i])] = "Silver Medal";
            }
            else if( i == score.length-3) {
                str[map.get(score[i])] = "Bronze Medal";
            }
            else {
                str[map.get(score[i])] = Integer.toString(score.length-i);
            }
        }
        return str;
    }
}