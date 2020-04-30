package Wyjatki;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(devide(10,0));
        } catch (ArithmeticException e) {
            System.out.println("Nie dziel cholero przez 0!!!!");
        }
    }

    private static int devide(int a, int b) {
        return a/b;
    }
}
