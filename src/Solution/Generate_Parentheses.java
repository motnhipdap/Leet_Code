package Solution;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses {
    public static List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<String>();
        if (n == 0)
            return ans;

        backtrack(ans, new StringBuilder(), 0, 0, n);

        return ans;
    }

    private static void backtrack(List<String> ans, StringBuilder cur, int open, int close, int n) {
        if (cur.length() == n * 2) {
            ans.add(cur.toString());
            return;
        }

        if (open < n) {
            cur.append("(");
            backtrack(ans, cur, open + 1, close, n);
            cur.deleteCharAt(cur.length() - 1);
        }

        if (close < open) {
            cur.append(")");
            backtrack(ans, cur, open, close + 1, n);
            cur.deleteCharAt(cur.length() - 1);
        }

        System.out.println(cur.toString());


    }

    public static void main(String[] args) {
        var ans = generateParenthesis(3);
        System.out.println(ans);
    }
}
