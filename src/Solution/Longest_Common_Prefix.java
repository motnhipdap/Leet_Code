package Solution;

public class Longest_Common_Prefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        if (strs.length == 1)
            return strs[0];

        StringBuilder sb = new StringBuilder();
        String prefix = strs[0];
        for (int i = 0; i < strs.length; i++) {
            if (prefix.length() > strs[i].length())
                prefix = strs[i];
        }

        for (int idx = 0; idx < prefix.length(); idx++) {

            char c = prefix.charAt(idx);

            for (int i = 0; i < strs.length; i++) {
                if (c != strs[i].charAt(idx))
                    return sb.toString().trim();
            }

            sb.append(c);

        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"cir", "car"}));
    }
}
