package Solution;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    static int[] searchRange(int[] nums, int target) {
        int first = lower_bound(nums, target);
        int last = upper_bound(nums, target) - 1;

        if (first == nums.length || nums[first] != target)
            return new int[] { -1, -1 };
        return new int[] { first, last };
    }

    static int lower_bound(int[] a, int k) {
        int l = 0;
        int r = a.length;

        while (l < r) {
            int m = l + (r - l) / 2;
            if (a[m] < k)
                l = m + 1;
            else
                r = m;
        }

        return l;
    }

    static int upper_bound(int[] a, int k) {
        int l = 0;
        int r = a.length;

        while (l < r) {
            int m = l + (r - l) / 2;
            if (a[m] <= k)
                l = m + 1;
            else
                r = m;
        }

        return l;
    }

    public static void main(String[] args) {
        Utils.Array.out(searchRange(new int[] { 5, 7, 7, 8, 8, 5 }, 5));
    }
}
