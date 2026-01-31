package Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_sum_II {
    static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        Arrays.sort(candidates);
        backtrack(candidates, 0, target, new ArrayList<>(), ans);

        return ans;
    }

    static void backtrack(int[] a, int i, int k, List<Integer> tmp, List<List<Integer>> ans) {
        if (k == 0) {
            ans.add(new ArrayList<>(tmp));
            return;
        }

        for (int j = i; j < a.length; j++) {

            if (j > i && a[j] == a[j - 1])
                continue;

            if (a[j] > k)
                return;

            tmp.add(a[j]);
            backtrack(a, j + 1, k - a[j], tmp, ans);
            tmp.remove(tmp.size() - 1);
        }
    }

    public static void main(String[] args) {
        var ans = combinationSum2(new int[] { 10, 1, 2, 7, 6, 1, 5 }, 8);
        for (var item : ans) {
            for (int x : item)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}
