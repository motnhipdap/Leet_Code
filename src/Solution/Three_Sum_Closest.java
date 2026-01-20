package Solution;

import java.util.Arrays;

public class Three_Sum_Closest {
    public static int threeSumClosest(int[] nums, int target) {
        int ans = 0;
        int minAns = Integer.MAX_VALUE;
        int n = nums.length;

        if (n < 3)
            return 0;

        Arrays.sort(nums);

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int l = i + 1, r = n - 1;
            while (l < r) {

                int sum = nums[i] + nums[l] + nums[r];

                if (minAns > Math.abs(target - sum)) {
                    ans = sum;
                    minAns = Math.abs(target - sum);
                }

                if (sum > target) {
                    r--;
                } else if (sum < target) {
                    l++;
                } else {
                    return sum;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90}, 1));
    }
}
