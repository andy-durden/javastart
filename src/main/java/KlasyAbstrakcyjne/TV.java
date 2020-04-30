package KlasyAbstrakcyjne;

public abstract class TV implements ChangeChannel,  Change {

    public abstract void wlaczTV(boolean b);

    @Override
    public String toString() {
        return "Metoda to String klasy Tv";


    }

    public static void changeVolume(){

        System.out.println("Zmiana glośności");
    }

    /*   if(b){
            System.out.println("TV is on");
        }else {
            System.out.println("Tv is off");
        }
    }


      */

}
