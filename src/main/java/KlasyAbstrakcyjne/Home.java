package KlasyAbstrakcyjne;

public class Home implements ChangeChannel {

    public static void main(String[] args) {

        Nosy nosy=new Nosy();
        System.out.println(nosy.toString());

        String s1="tekst";
        String s2=new String("tekst");
        if (s1==s2)
            System.out.println("s1==s2");

        if (s1.equals(s2))
            System.out.println("s1.equalss2");
        if(nosy instanceof Object)
            System.out.println("s1 instnceof Object");

        TV.changeVolume();
        int y=Nosy.a;
    }


    @Override
    public void changeChannel() {

    }
}
