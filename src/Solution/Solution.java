package Solution;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        int[] tmp = new int[26];
        tmp[0] = 0;

        char[] ts = t.toCharArray();
        char[] ss = s.toCharArray();

        for (int i = 0; i < ts.length; i++) {
            tmp[ts[i] - 'a']++;
            tmp[ss[i] - 'a']--;
        }

        for (int x : tmp) {
            if (x != 0)
                return false;
        }

        return true;
    }

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[]{-1, -1};
    }

    public boolean isPalindrome(int x) {
        // the number is palidrome when it reads the same forward and backward
        String tmp = Integer.toString(x);
        int l = 0, r = tmp.length();
        while (l <= r) {
            if (tmp.charAt(r) != tmp.charAt(l))
                return false;
            l++;
            r--;

        }

        return true;
    }

    public int romanToInt(String s) {
// chữ số la mã
        /*
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000
      */
        int res = 0;

        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );


        for (int i = 0; i < s.length(); i++) {

            int prev = map.get(s.charAt(i));
            int next = (i + 1 < s.length()) ? map.get(s.charAt(i + 1)) : 0;

            if (prev < next)
                res -= prev;
            else
                res += prev;
        }

        return res;
    }
}
