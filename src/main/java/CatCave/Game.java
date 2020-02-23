package CatCave;

import java.util.Scanner;

public class Game {

    public void move(Player player, Board board){
        Scanner scan = new Scanner(System.in);
        int i;
        int j;

        System.out.println("Runda gracza: " + player.mark);
        System.out.println("Gdzie chcesz postawić?");
        System.out.println("Podaj współrzędne np 1 1");

        while (true) {
            i = scan.nextInt();
            j = scan.nextInt();
            if (j > 3 || j < 1 || i > 3 || i < 1 ){
                System.out.println("Niepoprawne współrzędne");

            } else if (board.getBoard()[i-1][j-1] != Mark.Z ){
                System.out.println("To pole jest zajęte");
                System.out.println("Spróbuj jeszcze raz");

            } else {
                board.getBoard()[i-1][j-1] = player.mark;
                break;
            }

        }

    }

}
