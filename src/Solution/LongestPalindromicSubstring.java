
package Solution;

public class LongestPalindromicSubstring {
    // chuỗi con đối xứng dài nhất

    //Quy hoạch động
    public static String Solution(String s) {

        int n = s.length();

        System.out.println(n);
        if (n == 0 || n == 1)
            return s;
        s = 'x' + s;
        boolean[][] f = new boolean[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            f[i][i] = true;
        }

        int l = 1, r = 1;
        int maxlen = 1;

        for (int len = 2; len <= n; len++) {

            for (int i = 1; i <= n - len + 1; i++) {

                int j = i + len - 1;
                boolean flag = s.charAt(i) == s.charAt(j);

                if (len == 2 && flag) f[i][j] = true;
                else
                    f[i][j] = f[i + 1][j - 1] && flag;

                if (f[i][j]) {
                    if (maxlen < len) {
                        maxlen = len;
                        r = j;
                        l = i;
                    }
                }
            }
        }

        return s.substring(l, r + 1);
    }

    public static void main(String[] args) {
        System.out.println(Solution("kyyrjtdplseovzwjkykrjwhxquwxsfsorjiumvxjhjmgeueafubtonhlerrgsgohfosqssmizcuqryqomsipovhhodpfyudtusjhonlqabhxfahfcjqxyckycstcqwxvicwkjeuboerkmjshfgiglceycmycadpnvoeaurqatesivajoqdilynbcihnidbizwkuaoegmytopzdmvvoewvhebqzskseeubnretjgnmyjwwgcooytfojeuzcuyhsznbcaiqpwcyusyyywqmmvqzvvceylnuwcbxybhqpvjumzomnabrjgcfaabqmiotlfojnyuolostmtacbwmwlqdfkbfikusuqtupdwdrjwqmuudbcvtpieiwteqbeyfyqejglmxofdjksqmzeugwvuniaxdrunyunnqpbnfbgqemvamaxuhjbyzqmhalrprhnindrkbopwbwsjeqrmyqipnqvjqzpjalqyfvaavyhytetllzupxjwozdfpmjhjlrnitnjgapzrakcqahaqetwllaaiadalmxgvpawqpgecojxfvcgxsbrldktufdrogkogbltcezflyctklpqrjymqzyzmtlssnavzcquytcskcnjzzrytsvawkavzboncxlhqfiofuohehaygxidxsofhmhzygklliovnwqbwwiiyarxtoihvjkdrzqsnmhdtdlpckuayhtfyirnhkrhbrwkdymjrjklonyggqnxhfvtkqxoicakzsxmgczpwhpkzcntkcwhkdkxvfnjbvjjoumczjyvdgkfukfuldolqnauvoyhoheoqvpwoisniv"));
    }
}
