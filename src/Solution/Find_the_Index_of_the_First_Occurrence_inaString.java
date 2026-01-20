package Solution;

public class Find_the_Index_of_the_First_Occurrence_inaString {
    public static int strStr(String haystack, String needle) {
     
        int ans = 0;

        ans = haystack.indexOf(needle);
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(strStr("saddd", "sad"));
    }

}
