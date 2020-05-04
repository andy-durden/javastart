package KolkoKrzyzyk;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        System.out.println("Witaj w grze, podaj wymiar planszy:  ");

        int wymiar = new Scanner(System.in).nextInt();
        char obecnySymbol = 'X';
        char[][] plansza = new char[wymiar][wymiar];
/*               {{'O', 'X', 'X'},
                {'O', 'X', ' '},
                {' ', 'O', 'O'}};

 */
        while (true) {
            TicTacToe.drukujPlansze(plansza);

            boolean ruchPoprawny = wykonajRuch(plansza, obecnySymbol);
            if (ruchPoprawny) {
                boolean wygranaWiersze=sprawdzWiersze(plansza,obecnySymbol);
                boolean wygranaKolumny=sprawdzKolumny(plansza,obecnySymbol);
                boolean wygranaSkos1=sprawdzSkos1(plansza,obecnySymbol);

                boolean wygranaSkos2=sprawdzSkos2(plansza,obecnySymbol);

                if (obecnySymbol == 'X') {
                    obecnySymbol = 'O';
                } else {
                    obecnySymbol = 'X';
                }

            }


            //   obecnySymbol = (obecnySymbol == 'X') ? 'O' : 'X';  to samo co w ifie wyżej

        }
    }
public static boolean sprawdzWiersze(char[][] plansza,char symbol){
        
}
    public static void drukujPlansze(char[][] plansza) {
        int wymiar = plansza.length;

        System.out.print("\t");
        for (int i = 0; i < wymiar; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();

        for (int wiersz = 0; wiersz < plansza.length; wiersz++) {
            System.out.print(wiersz + ":\t ");

            for (int kolumna = 0; kolumna < plansza[wiersz].length; kolumna++) {


                System.out.print(plansza[wiersz][kolumna] + "\t");

            }
            System.out.println();
        }


    }

    public static boolean wykonajRuch(char[][] plansza, char symbol
    ) {
        System.out.println(symbol + "Twój ruch");
        System.out.println("podaj indeks wiersza");

        int wiersz = new Scanner(System.in).nextInt();

        System.out.println("podaj indeks kolumny");

        int kolumna = new Scanner(System.in).nextInt();

        boolean ruchPoprawny = plansza[wiersz][kolumna] == 0;
        if (!ruchPoprawny) {
            System.out.println("Ruch nie poprawny");
            return false;
        }
        plansza[wiersz][wiersz] = symbol;
        return true;

    }

}
