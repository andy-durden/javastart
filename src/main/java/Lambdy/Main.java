package Lambdy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        main.run();
    }

    private void run() {

        List<String> names = new ArrayList<>();
        names.add("Dorota");
        names.add("Maciek");
        names.add("Andrzej");
        names.add("Julia");
        names.add("Dorota");
        names.add("Damian");
        names.add("Bartek");
        names.add("Ola");

        names.stream()
                .filter(s ->s.endsWith("a"))
                .map(name->name+"!")
                .forEach(System.out::println);

        names = filter(names, new Filter() {
            @Override
            public boolean filter(String name) {
                return name.endsWith("a");
            }
        });

        modifyAndDisplay(names, s -> s + " " + "!");
    }

    private List<String> filter(List<String> input, Filter filter) {
        List<String> resultList = new ArrayList<>();
        for (String name : input) {

            if (filter.filter(name)) {
                resultList.add(name);
            }
        }
        return resultList;
    }

    private void modifyAndDisplay(List<String> names, Modifier modifier) {
        List<String> modifiedNames = new ArrayList<>();


        for (String name : names) {
            String modifiedName = modify(name, modifier);

         /*  String modifiedName=modify(name, new Modifier() {          //poniewaz Modifier zawiera tylko jedna metode
               @Override                                              //mozemy przerobic to na lambde
               public String modify(String s) {                        //jak u góry
                   Random random=new Random();

                   return   name+" "+random.nextInt(11);
               }
           });

          */
            modifiedNames.add(modifiedName);


        }
        System.out.println(modifiedNames);

     /*   names.sort((s, s2) -> Integer.compare(s.length(), s2.length()));  //lambda
        Comparator<String> c = Comparator.comparingInt(String::length);
        names.sort(c);
        System.out.println(names);

        names.sort((s, s2) -> {

            System.out.println(s);
            return Integer.compare(s.length(), s2.length());      //lambda

        });
        names.sort(new Comparator<String>() {                  //Comparator
            @Override
            public int compare(String s, String s2) {
                return 0;
            }
        });

      */
    }


    private String modify(String string, Modifier modifier) {

        return modifier.modify(string);
    }


}

