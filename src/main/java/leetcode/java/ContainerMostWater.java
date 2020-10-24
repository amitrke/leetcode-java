package leetcode.java;

public class ContainerMostWater {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int max = 0;
        
        while (l < r) {
            int width = r-l;
            int currHeight = Math.min(height[l], height[r]);
            int area = width * currHeight;
            max = Math.max(max, area);
            if (height[l] > height[r]) {
                r--;
            } else {
                l++;
            }
            
        }
        return max;
    }
}
