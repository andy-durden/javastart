package Dziedziczenie;

import java.time.LocalDate;

public class Kierownik extends Pracownik {


    String dzial;


    public Kierownik(String imie, String nazwisko, LocalDate dataUrodzenia,String dzial) {
        super(imie, nazwisko, dataUrodzenia);
        this.dzial=dzial;
    }

    void przydzielPremie(){

    }

    @Override
    public String toString() {
        return "Kierownik{" +
                "dzial='" + dzial + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", dataUrodzenia=" + dataUrodzenia +
                '}';
    }
}
