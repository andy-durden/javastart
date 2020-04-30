package Sortowanie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();

        list.add(new Person(22, "Andrzej", "Zakrzewski"));
        list.add(new Person(45, "Maciek", "Papiewski"));
        list.add(new Person(34, "Julia", "Zakrzewska"));
        list.add(new Person(43, "Julia", "Zakrzewska"));
        list.add(new Person(13, "Franek", "Tessa"));
        list.add(new Person(40, "Rafał", "Antkowiak"));
        list.add(new Person(11, "Julia", "Zakrzewska"));
        list.add(new Person(40, "Ola", "Zakrzewska"));

        // Collections.sort(list);

     /*  Collections.sort(list);

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -1*o1.compareTo(o2);
            }
        });

      */

        //   System.out.println(list);

      /*  Collections.sort(list, new PersonComparator());
        System.out.println(list);

        Collections.sort(list, new PersonAgeComparator().reversed());
        System.out.println(list);

        Collections.sort(list, new PersonLastNameComparator());
        System.out.println(list);
*/
         //Collections.sort(list, Comparator.comparingInt(Person::getAge));
        Collections.sort(list, (o1, o2) -> Integer.compare(o1.getAge(),o2.getAge()));
       // Comparator<Person> c = Comparator.comparingInt(Person::getAge);
      //  Comparator<Person> reversed = c.reversed();

        //Collections.sort(list, reversed);

        System.out.println(list);

    }
}

