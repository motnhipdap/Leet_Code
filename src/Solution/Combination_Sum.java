package Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum {
    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        backtrack(candidates, ans, new ArrayList<Integer>(), target, 0);

        return ans;
    }

    static void backtrack(int[] a, List<List<Integer>> ans, List<Integer> tmp, int k, int j) {
        if (k == 0) {
            ans.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = j; i < a.length; i++) {
            if (a[i] > k)
                return;
            tmp.add(a[i]);
            backtrack(a, ans, tmp, k - a[i], i);
            tmp.remove(tmp.size() - 1);
        }
    }

    public static void main(String[] args) {
        var ans = combinationSum(new int[] { 2, 3, 5 }, 8);
        for (var item : ans) {
            for (int x : item)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}
