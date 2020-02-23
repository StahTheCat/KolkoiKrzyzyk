package CatCave;

import java.util.Arrays;

public class Board {

    char[][] board;

    public Board() {
        this.board = new char[3][3];
    }

    public char[][] getBoard() {
        return board;
    }

    public void fillBoard() {

        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], ' ');
        }

    }

    public void printBoard() {

        StringBuilder sb = new StringBuilder();
        sb.append("Obecny stan planszy \n");
        sb.append("   1   2   3 \n");

        for (int i = 0; i < board.length; i++) {
            sb.append(i + 1 + " ");
            for (int j = 0; j < board[i].length; j++) {
                if (j == 2) {
                    sb.append(" " + board[i][j] + "");
                } else {
                    sb.append(" " + board[i][j] + " |");
                }
            }
            sb.append("\n");
            if (i < 2) {
                sb.append("--------------\n");
            }
        }
        System.out.println(sb);
    }


}
