package KlasyObiektyMetody;

public class Person {

    static  int ileRazy;

    String name;
    int age;
    boolean isAlive;
    boolean isWorking;


    String przedstawSie(boolean formal) {
        ileRazy++;
        if (formal) {
            String przywitanie="Dzień dobry, mam na imię " + name;

            return przywitanie;
        } else {
          return   "Cześć jestem " + name + " Mam " + age + "lat";
        }

    }

    static int ileRazySiePrzedstawil() {
        return ileRazy;
    }




   /* void przedstawSie(boolean formal) {
        if (formal) {
            System.out.println("Dzień dobry, mam na imię " + name);
        } else {
            System.out.println("Cześć jestem " + name + " Mam " + age + "lat");
        }

    }*/

}
