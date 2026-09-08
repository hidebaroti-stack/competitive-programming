class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int maxArea = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                int Area = Math.min(height[left], height[right]) * (right - left);
                if (Area > maxArea) maxArea = Area;
                left++;
            } else {
                int Area = Math.min(height[left], height[right]) * (right - left);
                if (Area > maxArea) maxArea = Area;
                right--;
            }
        }
        return maxArea;
    }
}