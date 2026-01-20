package Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Four_Sum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        if (n < 4)
            return res;

        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                long tmp = (long) nums[i] + nums[j];

                int l = j + 1, r = n - 1;

                while (l < r) {
                    long sum = tmp + (long) nums[l] + (long) nums[r];

                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));

                        while (l < r && nums[l] == nums[l + 1]) l++;
                        while (l < r && nums[r] == nums[r - 1]) r--;

                        l++;
                        r--;
                    } else if (sum < target) l++;
                    else r--;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(fourSum(new int[]{1000000000, 1000000000, 1000000000, 1000000000}, -294967296));
    }
}
