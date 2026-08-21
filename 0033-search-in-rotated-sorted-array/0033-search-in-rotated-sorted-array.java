class Solution {
    public static int pivot(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (nums[low] > nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int find(int[] nums, int low, int high, int target) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int low = 0;
        int peak = pivot(nums);
        int high = peak;
        int index = find(nums, low, high, target);
        if (index == -1) {
            low = peak + 1;
            high = nums.length - 1;
            index = find(nums, low, high, target);
            return index;
        } else {
            return index;
        }
    }
}