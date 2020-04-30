package VarArgs;

import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {

        int t = vararg(1, 2, 3, 35, 66,292827);
        System.out.println(t);


        int result = add(2, 4, 5, 5, 6, 6, 7, 8, 9);
        System.out.println(result);


    }

        private static int add(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int value = numbers[i];

            System.out.println("Element " + (i + 1) + " to " + value);

            sum += value;
        }
        return sum;
    }

    public static int vararg(int  ... args) {
        int wynik = 0;
        for (int i = 0; i < args.length; i++) {
            int value=args[i];
            System.out.println("Element " + (i + 1) + " to " + i);

            wynik += value;
        }
        return wynik;
    }

}

//List<String > liczby=Arrays.asList();
// int[] numbers = new int[]{7, 5, 5, 5, 8, 9};
// int i = 0;

//   System.out.println(numbers);

//for (int i = 0; i < 10; i++)
//  numbers[i] = i + 1;

//int zmienna = numbers[3];

// for (int i = 0; i < 10; i++)
// System.out.println("Kolejna komórka to: " + numbers[]);

//  String numbers1 = Arrays.toString(numbers);

//    System.out.println(numbers1);
//  System.out.println(numbers1.indexOf(1, 3));

//Stream<Integer> wynik = Arrays.stream(numbers);
//wynik.toString();


//wynik.forEach(n-> System.out.println(n));





