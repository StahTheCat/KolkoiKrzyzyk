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
                sb.append("  -----------\n");
            }
        }
        System.out.println(sb);
    }

    public boolean isThereWinner() {

        //sprawdź wiersze
        for (int i = 0; i < board.length; i++) {
            int winCounter = 0;
            for (int j = 0; j < board.length - 1; j++) {
                if (board[i][j] == board[i][j + 1]) {
                    winCounter++;
                }
                if (winCounter == board.length - 1) {
                    return true;
                }
            }
        }
        //sprawdź kolumny
        for (int j = 0; j < board.length; j++) {
            int winCounter = 0;
            for (int i = 0; i < board.length - 1; i++) {
                if (board[i][j] == board[i + 1][j]) {
                    winCounter++;
                }
                if (winCounter == board.length - 1) {
                    return true;
                }
            }
        }
        //sprawdź diagonale
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[0][2]) {
            return true;
        }


        return false;
    }


}
