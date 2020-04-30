package Enumy;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        for (MovieCategory movieCategory : MovieCategory.values()) {
            System.out.println(movieCategory +" "+movieCategory.isCool());
        }

        /*
                    int ordinal = MovieCategory.ROMANTYCZNY.ordinal();//podaje pozycje enumu
            System.out.println(ordinal);

              MovieCategory romatyczny=MovieCategory.ROMANTYCZNY;
            MovieCategory horror=MovieCategory.HORROR;

              int i = romatyczny.compareTo(horror);
            System.out.println(i);
        */


        List<Movie> movies = Arrays.asList(
                new Movie("klan", MovieCategory.SERIAL),
                new Movie("titanic", MovieCategory.ROMANTYCZNY),
                new Movie("pila", MovieCategory.HORROR),
                new Movie("blade runner", MovieCategory.SCI_FI),
                new Movie("blade runner2", MovieCategory.SCI_FI)
        );
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kategorię filmu.Dostepne to : ");

        MovieCategory[] movieCategories = MovieCategory.values();

        for (MovieCategory movieCategory : movieCategories) {
            System.out.println(movieCategory.name());
        }


        String userInput = scanner.nextLine();

        MovieCategory movieCategory = MovieCategory.valueOf(userInput);
        System.out.println("Filmy z tej kategorii :");


        for (Movie movie : movies) {
            if (movie.getMovieCategory() == movieCategory) {
                System.out.println(movie.getTitle() + " " + movie.getMovieCategory());
            }
        }
    }

}


