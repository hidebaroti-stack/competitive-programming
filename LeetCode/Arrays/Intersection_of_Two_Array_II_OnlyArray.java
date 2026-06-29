import java.util.Arrays;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] arr = new int[1001];

        if (nums1.length > nums2.length) return intersect(nums2, nums1);

        for (int num : nums1) {
            arr[num]++;
        }
        int index = 0;
        for (int num : nums2) {
            if(arr[num] > 0) {
                nums2[index++] = num;
                arr[num]--;
            }
        }
        return Arrays.copyOf(nums2, index);
    }
}