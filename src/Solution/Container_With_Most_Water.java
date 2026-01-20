package Solution;

public class Container_With_Most_Water {
    public static int maxArea(int[] height) {
        int ans = 0;
        int l = 0;
        int r = height.length - 1;

        while (l < r) {
            ans = Math.max(ans, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}
