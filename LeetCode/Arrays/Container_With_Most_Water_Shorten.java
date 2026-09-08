class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int maxArea = 0;

        while (left < right) {
            // calculate area for curr pair
            int Area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, Area);

            // move pointer at the shorter line
            if (height[left] < height[right]) left++;
            else right--;
        }

        return maxArea;
    }
}