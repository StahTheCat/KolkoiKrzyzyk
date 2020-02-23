package CatCave;

import java.util.Scanner;

public class Player {

    Mark mark;

    public Player(){
        this.mark = mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public void choose(Player player){
        System.out.println("Graczu wybierz znak");
        System.out.println("Do wyboru masz X i O");

        Scanner scan = new Scanner(System.in);

        while (true) {
            char playerMark = scan.next().charAt(0);

            if (playerMark == 'o' || playerMark == 'O' || playerMark == 0) {
                player.setMark(Mark.O);
                break;
            } else if (playerMark == 'x' || playerMark == 'X') {
                player.setMark(Mark.X);
                break;
            } else {
                System.out.println("Niepoprawny znak");
                System.out.println("Wybierz proszę X lub O");
            }
        }

    }
}
