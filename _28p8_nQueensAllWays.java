public class _28p8_nQueensAllWays {
    public static void printBoard(char board[][]) {
        int len = board.length;
        System.out.println("-----Chesh Board-----");
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static boolean checkQueen(char board[][], int row, int col) {
        boolean res = true;
        // checking vertical up
        for (int i = row; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                res = false;
            }
        }
        // checking diagonal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                res = false;
            }
        }
        // checking diagonal right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                res = false;
            }
        }
        return res;
    }

    public static void nQueens(char board[][], int row) {
        // base
        if (row == board.length) {
            printBoard(board);
            return;
        }
        // column loop
        for (int j = 0; j < board.length; j++) {
            if (checkQueen(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);// function call
                board[row][j] = 'x';// backtracking
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        nQueens(board, 0);
    }
}