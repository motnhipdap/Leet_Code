package Solution;

public class First_Missing_Positive {
    static int firstMissingPositive(int[] nums) {
        int i = 0;
        int n = nums.length;

        while (i < n) {
            int x = nums[i];
            System.out.println(x);
            if (x < 0) {
                i++;
                continue;
            }
            if (x > 0 && x <= n && nums[x - 1] != x) {
                int tmp = nums[x - 1];
                nums[x - 1] = x;
                nums[i] = tmp;
            } else {
                System.out.println("hehe");
                i++;
            }
        }

        System.out.println("HIH");

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return j + 1;
            }
        }

        for (int x : nums)
            System.out.print(x + " ");

        return nums[i - 1] + 1;
    }

    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[] { 1, 2, 0 }));
    }

}
