package Dziedziczenie;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {


        Pracownik pracownik=new Pracownik("Andrzej", "Wczorajszy", LocalDate.of(1992,8,7));
        Kierownik kierownik=new Kierownik("Tomasz", "Urwał", LocalDate.of(1979,9,7),"IT");
        Pracownik kierownik1=new Kierownik("Adam",  "Słodowy",  LocalDate.of(1223,9,7),"DeVOPS");

        System.out.println(pracownik);
        System.out.println(kierownik);
        System.out.println(kierownik1);


    }
}
