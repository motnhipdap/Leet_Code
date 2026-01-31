package Solution;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    static List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        boolean[] check = new boolean[n];
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        for (int i = 0; i < n; i++)
            check[i] = false;

        backtrack(n, new ArrayList<>(), ans, check, nums);

        return ans;
    }

    static void backtrack(int n, List<Integer> a, List<List<Integer>> ans, boolean[] check, int[] nums) {
        if (a.size() == n) {
            ans.add(new ArrayList<>(a));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!check[i]) {
                a.add(nums[i]);
                check[i] = true;
                backtrack(n, a, ans, check, nums);
                a.remove(a.size() - 1);
                check[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        var ans = permute(new int[] { 1, 2, 3 });
        for (var i : ans) {
            for (int num : i) {
                System.out.print(num);
            }
            System.err.println();
        }
    }
}
