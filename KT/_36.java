public class _36 {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (!checkRow(board, i))
                return false;
            if (!checkCol(board, i))
                return false;
        }

        for (int i = 0; i < board.length - 2; i += 3) {
            for (int j = 0; j < board.length - 2; j += 3) {
                if (!checkGrid(board, i, j))
                    return false;
            }
        }
        return true;
    }

    public boolean checkRow(char[][] board, int i) {
        int[] arr = new int[10];
        for (int j = 0; j < board.length; j++) {
            int temp = board[i][j] - '0';
            if (board[i][j] != '.') {
                if (arr[temp] != 0)
                    return false;
                else
                    arr[temp]++;
            }
        }
        return true;
    }
    public boolean checkCol(char[][] board, int i) {
        int[] arr = new int[10];
        for (int j = 0; j < board.length; j++) {
            int temp = board[j][i] - '0';
            if (board[j][i] != '.') {
                if (arr[temp] != 0)
                    return false;
                else
                    arr[temp]++;
            }
        }
        return true;
    }
    public boolean checkGrid(char[][] board, int i, int j) {
        int[] arr = new int[10];
        for (int k = i; k < i + 3; k++) {
            for (int l = j; l < j + 3; l++) {
                if (board[k][l] != '.') {
                    int temp = board[k][l] - '0';
                    if (arr[temp] != 0)
                        return false;
                    else
                        arr[temp]++;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        _36 test = new _36();
        char[][] board = 
        {{'5','3','.','.','7','.','.','.','.'}
        ,{'6','.','.','1','9','5','.','.','.'}
        ,{'.','9','8','.','.','.','.','6','.'}
        ,{'8','.','.','.','6','.','.','.','3'}
        ,{'4','.','.','8','.','3','.','.','1'}
        ,{'7','.','.','.','2','.','.','.','6'}
        ,{'.','6','.','.','.','.','2','8','.'}
        ,{'.','.','.','4','1','9','.','.','5'}
        ,{'.','.','.','.','8','.','.','7','9'}};
        System.out.println(test.isValidSudoku(board));
    }
}
