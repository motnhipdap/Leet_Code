package Solution;

public class Remove_Duplicates_from_Sorted_Array {
    public static int removeDuplicates(int[] nums) {

        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i];
            nums[ans] = tmp;
            while (i < nums.length - 1 && nums[i + 1] == tmp) {
                i++;
            }
            ans++;
        }
        for (var x : nums) {
            System.out.println(x);
        }

        return ans;
    }

    public static void main(String[] args) {
        // System.out.println(removeDuplicates(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4
        // }));
        System.out.println(removeDuplicates(new int[] { 1, 1, 2 }));
    }

}
