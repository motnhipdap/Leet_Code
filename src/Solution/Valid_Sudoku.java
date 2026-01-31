package Solution;

public class Valid_Sudoku {
    public static boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[9][9];
        int[][] cols = new int[9][9];
        int[][] boxes = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                int idxB = (i / 3) * 3 + j / 3;

                if (board[i][j] == '.')
                    continue;

                int val = board[i][j] - '1';

                if (rows[i][val] == 1)
                    return false;
                rows[i][val] = 1;

                if (cols[j][val] == 1)
                    return false;
                cols[j][val] = 1;
                if (boxes[idxB][val] == 1)
                    return false;
                boxes[idxB][val] = 1;

            }
        }

        return true;
    }
    // static boolean isValidSudoku(char[][] board) {
    // Set<String> set = new HashSet<>();

    // int n = board.length;

    // for (int i = 0; i < 9; i++) {
    // for (int j = 0; j < 9; j++) {

    // char val = board[i][j];

    // if (val == '.')
    // continue;

    // String r = val + "r" + i;
    // String c = val + "c" + i;
    // String b = val + "boxes" + i / 3 + "-" + j / 3;

    // if (!set.add(r) || !set.add(c) || !set.add(b))
    // return false;
    // }
    // }

    // return true;
    // }

}
