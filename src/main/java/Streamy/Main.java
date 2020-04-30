package Streamy;


import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Stream<Integer> iterate = Stream.iterate(1, n -> n + 1);
        //iterate.forEach(n-> System.out.println(n));

        List<String> names = Arrays.asList("Tomek", "Paweł", "Dorota", "Edyta", "Dorota");

        List<User> userList = names.stream()
                .filter(n -> n.endsWith("a"))
                .map(string -> new User(string, new Random().nextInt(70)))
                .sorted(Comparator.comparing(User::getName))
                .collect(Collectors.toList());
        System.out.println(userList);


        //   System.out.println(names);
        //  Stream<String> stream1 = names.stream();
        //Stream<String> stream2 = stream1.filter(s -> s.endsWith("a"));
        // stream2.forEach(n-> System.out.println(n));

        //  Stream<String> stream1 = names.stream();
        //  Stream<String> streamFiltered = stream1.filter(s -> s.endsWith("a"));//filter zwraca streama
        // List<String> filteredNames=streamFiltered.collect(Collectors.toList());//lista wyswietli 2 razy Dorota
        //  Set<String> filteredNames1=streamFiltered.collect(Collectors.toSet());//metoda terminalna
        // System.out.println(filteredNames);
        //System.out.println(filteredNames1);
        //   .forEach(System.out::println);//metoda terminalna, ktora nie zwraca streama

       /* List<String> names1=new ArrayList<>();
        names1.add("Antek");
        names1.add("Dorota");
        System.out.println(names1);
        names1.stream()
                .filter(s->s.endsWith("a"))
                .forEach(System.out::println);


        */
    }
}

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}