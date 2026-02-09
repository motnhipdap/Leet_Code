package Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations_II {
    static List<List<Integer>> permuteUnique(int[] nums) {
        int n = nums.length;
        boolean[] used = new boolean[n];
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        back(n, nums, used, ans, new ArrayList<>());

        return ans;

    }

    static void back(int n, int[] a, boolean[] used, List<List<Integer>> ans, List<Integer> tmp) {

        if (tmp.size() == n) {
            ans.add(new ArrayList<>(tmp));
            return;
        }

        for (int j = 0; j < n; j++) {
            if (!used[a[j]]) {
                if (j > 0 && a[j] == a[j - 1] && !used[j - 1])
                    continue;

                tmp.add(a[j]);
                used[j] = true;

                back(n, a, used, ans, tmp);

                tmp.remove(tmp.size() - 1);
                used[j] = false;
            }
        }

    }

    public static void main(String[] args) {
        var ans = permuteUnique(new int[] { 3, 3, 0, 3 });

        for (var item : ans) {
            for (int i : item)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}
