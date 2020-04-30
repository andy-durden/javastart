package ArgumentyMetod;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        main.run();
    }

    private void run() {

        System.out.println(add(1,2,3,4,5,6,7,8));

    }

    private int add(int... numbers) {

        int sum=0;

        for (int number : numbers) {

            sum+=number;
        }

        return sum;
    }




    //  private void change(Point p) {
    //
    //      p.x=99;                      //przekazywanie argumentu do metody za pomoca referencji
    //
    //  p.y=99;

}



      /*  Point point = new Point();
        point.x = 10;
        point.y = 100;
        change(point);

        System.out.println(point.x);
        System.out.println(point.y);


       */



        /*int a = 1;                       //przekazywanie argumentow do metody przez wartosc
        int b = 2;
        int c = 3;
        int result = add(a, b, c);
        System.out.println(result);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


         */





   /* private int add(int a, int b, int c) {
        a = 10;
        return a + b + c;
    }

    */

