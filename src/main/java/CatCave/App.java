package CatCave;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Game game = new Game();
        Board board = new Board();
        board.fillBoard();

        Player player1 = new Player();
        Player player2 = new Player();
        // wybierz znak
        Player.choose(player1);
        Player.choose(player2);

        //na wypadek gdyby drugi gracz chciał ten sam znak co pierwszy
        while (player1.mark == player2.mark) {
            System.out.println();
            System.out.println("jednak WCALE NIE ŚWIETNIE");
            System.out.println("Nie możecie oboje grać: "+ player1.mark);
            System.out.println("Gracz nr 2 powtarza...");
            Player.choose(player2);
        }


        // wydruk planszy
        board.printBoard();

        // gra
        while (true) {
            // runda gracza

            game.move(player1, board);
            board.printBoard();

            if (board.isThereWinner(player1)) {
                System.out.println("Mamy zwycięzce!!");
                System.out.println("Wygrywa: Gracz"+ player1.mark);
                System.out.println(Prize.p);
                break;
            }
            //zmiana gracza
            game.move(player2, board);
            board.printBoard();

            if (board.isThereWinner(player2)) {
                System.out.println("Mamy zwycięzce!!");
                System.out.println("Wygrywa: Gracz"+ player2.mark);
                System.out.println(Prize.p);
                break;
            }
            // ekran gratulacyjny
        }
    }

}
