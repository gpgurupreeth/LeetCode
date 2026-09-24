class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int totalLen = nums1.length + nums2.length;

        int division = totalLen / 2;

        int low = 0;
        int high = nums1.length;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int l1;
            int l2;
            int r1;
            int r2;

            int cut1 = mid;
            int cut2 = division - cut1;

            if (cut1 == 0) {
                l1 = Integer.MIN_VALUE;
            }
            else {
                l1 = nums1[cut1 - 1];
            }

            if (cut2 == 0) {
                l2 = Integer.MIN_VALUE;
            }
            else {
                l2 = nums2[cut2 - 1];
            }

            if (cut1 == nums1.length) {
                r1 = Integer.MAX_VALUE;
            }
            else {
                r1 = nums1[cut1];
            }

            if (cut2 == nums2.length) {
                r2 = Integer.MAX_VALUE;
            }
            else {
                r2 = nums2[cut2];
            }

            if (l1 <= r2 && l2 <= r1) {

                int max = Math.max(l1, l2);
                int min = Math.min(r1, r2);

                if (totalLen % 2 == 0) {
                    double res = (double)(max + min) / 2.0;
                    return res;
                }
                else {
                    return min;
                }
            }
            else if (l1 > r2) {
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }
        return -1;
    }
}