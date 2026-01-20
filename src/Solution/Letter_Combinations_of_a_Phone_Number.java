package Solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Letter_Combinations_of_a_Phone_Number {
    static Map<Integer, String> map = Map.of(
            2, "abc",
            3, "def",
            4, "ghi",
            5, "jkl",
            6, "mno",
            7, "pqrs",
            8, "tuv",
            9, "wxyz");

    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<String>();

        if (digits == null || digits.length() == 0)
            return ans;

        backtrack(digits, 0, new StringBuilder(), ans);

        return ans;
    }

    private static void backtrack(String digits, int idx, StringBuilder cur, List<String> ans) {
        if (idx == digits.length()) {
            ans.add(cur.toString());
            return;
        }

        int digit = digits.charAt(idx) - '0';
        String letter = map.get(digit);

        for (char c : letter.toCharArray()) {
            cur.append(c);
            backtrack(digits, idx + 1, cur, ans);
            cur.deleteCharAt(cur.length() - 1);
        }
    }

}
