package Solution;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int l = 0;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                l = Math.max(l, map.get(c) + 1);
            }
            map.put(c, i);
            res = Math.max(res, i - l + 1);
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(solution("dvdf"));
    }
}