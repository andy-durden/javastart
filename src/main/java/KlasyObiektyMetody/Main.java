package KlasyObiektyMetody;

public class Main {

    public static void main(String[] args) {

        Person pawel= new Person();
        pawel.name="Paweł";
        pawel.age=20;
        pawel.isAlive=true;
        pawel.isWorking=true;


        Person piotr= new Person();
        piotr.name="Piotr";
        piotr.age=80;
        piotr.isAlive=false;

        String przywitanie=pawel.przedstawSie(true);
        System.out.println(przywitanie);
        System.out.println(piotr.przedstawSie(false));//to samo
        String pzywitanie=piotr.przedstawSie(true); //to samo


        int ileRazy = Person.ileRazySiePrzedstawil();
        System.out.println("Osoby przestawiły się "+ileRazy+" razy");


       /* pawel.przedstawSie(false); traz nie wyswietli nic, bo metoda zwraca ale nie wyswietla
        piotr.przedstawSie(false);
        piotr.przedstawSie(true);
*/

       /* String name1="Paweł"; to samo co wyzej
        int age1=20;
        boolean isAlive1=true;

        String name2="Piotr";
        int age2=80;
        boolean isAlive2=false;

        */
    }
}
