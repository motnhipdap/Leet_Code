package Solution;

public class Jump_Game_II {
    static int jump(int[] nums) {
        int n = nums.length;
        int maxJump = 0;
        int curEnd = 0;
        int jumps = 0;

        for (int i = 0; i < n; i++) {
            maxJump = Math.max(i + nums[i], maxJump);
            if (i == curEnd) {
                jumps++;
                curEnd = maxJump;
            }
        }

        return jumps;

    }

    public static void main(String[] args) {
        jump(new int[] { 2, 3, 1, 1, 4 });
    }
}
