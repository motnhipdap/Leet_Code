package Solution;

public class Next_Permutation {
    public static void nextPermutation(int[] nums) {
        // tìm vị trí i sao cho a[i] <= a[i+1]
        // tìm ptu đầu tiên > a[i] i+1 -> n-1
        // hoán vị 2 phần tử đó
        // hoán đổi i +1 -> n-1

        int n = nums.length;
        int i = n - 2;

        while (i >= 0 && nums[i] >= nums[i + 1])
            i--;

        System.out.println(nums[i]);

        if (i >= 0) {

            int j = n - 1;
            while (j > i && nums[j] <= nums[i])
                j--;

            System.out.println(nums[j]);

            swap(nums, i, j);

        }
        reverse(nums, i + 1, n - 1);

        Utils.Array.out(nums);

    }

    static void swap(int[] a, int i, int j) {
        int tmp = a[j];
        a[j] = a[i];
        a[i] = tmp;
    }

    static void reverse(int[] a, int l, int r) {
        while (l < r) {
            swap(a, l++, r--);
        }
    }

    public static void main(String[] args) {
        nextPermutation(new int[] { 1, 2 });
    }
}
