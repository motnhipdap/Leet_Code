package Solution;

public class Sudoku_solution {

    static int[] rows = new int[9];
    static int[] cols = new int[9];
    static int[] boxes = new int[9];

    static void solution1(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    int bit = 1 << num;
                    rows[i] |= bit;
                    cols[j] |= bit;
                    boxes[(i / 3) * 3 + j / 3] |= bit;
                }
            }
        }
    }

    boolean backtrack(char[][] a) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == '.') {

                    for (int k = 0; k < 9; k++) {

                        int bit = 1 << k;
                        int box = (i * 3) / 3 + j;

                        if ((rows[i] & bit) == 0 &&
                                (cols[i] & bit) == 0 &&
                                (boxes[box] & bit) == 0) {

                            a[i][j] = (char) (k + '1');

                            rows[i] |= bit;
                            cols[j] |= bit;
                            boxes[box] |= bit;

                            if (backtrack(a))
                                return true;

                            a[i][j] = '.';
                            rows[i] ^= bit;
                            cols[j] ^= bit;
                            boxes[box] ^= bit;

                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

}
