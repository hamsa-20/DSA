class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        int count = 1;
        Arrays.sort(nums);
        List<int[]> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i < n && nums[i] == nums[i - 1]) {
                count++;
            } else {
                ans.add(new int[]{nums[i - 1], count});
                count = 1;
            }
        }
        Collections.sort(ans, (a, b) -> b[1] - a[1]);
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = ans.get(i)[0];
        }
        return result;
    }
}
