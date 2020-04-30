package Dziedziczenie;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pracownik {

    String imie;
    String nazwisko;
    LocalDate dataUrodzenia;
    String PESEL;

    public Pracownik(String imie, String nazwisko, LocalDate dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;

    }

    void idzNaUrlop(){

    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", dataUrodzenia=" + dataUrodzenia +
                '}';
    }
}
