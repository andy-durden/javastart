package KlasaArrays;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList();
        String[] array = {"Marcin", "Kasia", "Andrzej"};

        String string = Arrays.toString(array);
        System.out.println(string);

        Stream<String> stream = Arrays.stream(array);
        int[] ints = new int[100];
        Arrays.fill(ints, 0, 51, 50);
        Arrays.fill(ints, 51, 100, 20);
        Arrays.sort(ints);
        System.out.println(ints);

        String[] a = new String[]{"a", "b", "c"};
        String[] b = new String[]{"a", "b", "C"};
        int compare = Arrays.compare(a, 0, 3, b, 0, 3);
        System.out.println(compare);

        int[] ints1 = new int[]{0, 10, 100, 1000, 10001, 100000, 1000000};
        int[] ints2 = new int[]{0, 1, 2, 3, 5, 10, 100000};

        int compareResult = Arrays.compareUnsigned(ints2, ints1);
        System.out.println(compareResult);

        int[] Sorted = new int[]{0, 10, 100, 1000, 1001, 1005, 100006};

        int index = Arrays.binarySearch(ints1, 1000);
        System.out.println(index);

        int t=1;

      /* int x=15342364;
        x =x%10;
        System.out.println(x);
        int c=4;
        c=c+x%10;
        System.out.println(c);

        int y=153423646;
        y/=10;
        System.out.println(y);


       */
      /*  int x = 15342364;
        long ret = 96;

            ret = ret * 10 + x % 10;
            x /= 10;

        System.out.println(ret);
        System.out.println(x);


       */


    }
}
