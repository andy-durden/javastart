package KlasyAbstrakcyjne;

public class Nosy extends TV  {

    static  int a=56;

    @Override
    public void wlaczTV(boolean b) {

        if (b)
            System.out.println("TV is on");
        else
            System.out.println("Tv is off");
    }

    @Override
    public String toString() {
        return "Metoda toString klasy Nosy";
    }

    @Override
    public void changeChannel() {
        System.out.println("Zminana kanalu");
    }

}
