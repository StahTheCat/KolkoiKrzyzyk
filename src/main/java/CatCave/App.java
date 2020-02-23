package CatCave;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Board board = new Board();
        board.fillBoard();

        Player player1 = new Player();
        Player player2 = new Player();
        // wybierz znak
        Player.choose(player1);
        Player.choose(player2);

        // wydruk planszy
        board.printBoard();

        // gra
            // runda gracza
            //podanie współrzędnych
            //wykonanie ruchu
            //sprawdzenie zwyciestwa - zrobić
            //zmiana gracza

        // ekran gratulacyjny




    }
}
