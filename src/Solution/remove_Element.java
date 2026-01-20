package Solution;

public class remove_Element {
    public static int removeElement(int[] nums, int val) {
        int ans = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            if (nums[i] != val) {
                nums[ans++] = nums[i];
            }
        }

        for (int x : nums)
            System.out.println(x);

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[] { 3, 2, 2, 3 }, 3));
    }

}
