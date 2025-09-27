class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int l = nums1.length <= nums2.length ? nums1.length : nums2.length;
        int len = nums1.length >= nums2.length ? nums1.length : nums2.length;

        for (int i = 0; i < l; i++) {
            int start = 0;
            int end = len - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (nums1.length > nums2.length) {
                    if (nums2[i] == nums1[mid]) {
                        return nums2[i];
                    } else if (nums1[mid] > nums2[i]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                } else {
                    if (nums1[i] == nums2[mid]) {
                        return nums1[i];
                    } else if (nums2[mid] > nums1[i]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
        }
        return -1;
    }
}
