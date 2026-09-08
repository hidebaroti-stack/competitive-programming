class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int Area;
            if (height[left] < height[right]) {
                Area = height[left] * (right - left);
                left++;
            } else {
                Area = height[right] * (right - left);
                right--;
            }
            if (maxArea < Area) maxArea = Area;
        }
        System.gc();
        return maxArea;
    }
}