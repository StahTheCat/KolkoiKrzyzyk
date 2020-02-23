package CatCave;

import java.util.Arrays;

public class Board {

    Mark[][] board;

    public Board() {
        this.board = new Mark[3][3];
    }

    public Mark[][] getBoard() {
        return board;
    }

    public void fillBoard() {

        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], Mark.Z);
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

    public boolean isThereWinner(Player player) {

        //sprawdź wiersze
        for (int i = 0; i < board.length; i++) {
            int winCounter = 0;
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == player.mark) {
                    winCounter++;
                }
                if (winCounter == board.length) {
                    return true;
                }
            }
        }
        //sprawdź kolumny
        for (int i = 0; i < board.length; i++) {
            if (board[0][i] == player.mark
                    && board[1][i] == player.mark && board[1][i] == board[2][i]){
                return true;
            }


        }
        //sprawdź diagonale
        if (board[0][0] == player.mark &&
                player.mark == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        }
        if (board[0][2] == player.mark && player.mark == board[1][1] && board[2][0] == board[0][2]) {
            return true;
        }


        return false;
    }


}
