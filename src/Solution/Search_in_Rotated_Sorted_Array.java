package Solution;

public class Search_in_Rotated_Sorted_Array {
    public static int search(int[] nums, int target) {
        int n = nums.length;
        if (n == 0)
            return -1;

        int l = 0, r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            if (nums[m] == target)
                return m;

            // trường hợp l == m
            if (nums[m] >= nums[l]) {
                if (target < nums[m] && target >= nums[l])
                    r = m - 1;
                else
                    l = m + 1;
            } else {
                if (target > nums[m] && target <= nums[r])
                    l = m + 1;
                else
                    r = m - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0));
    }
}
