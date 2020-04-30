package Wyjatki;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {

    public static void main(String[] args) {

        try {
            run();
        } catch (FileNotExistsExeption e) {
            System.out.println(e.getMessage());
        }
    }

    private static void run() throws FileNotExistsExeption {

        File file=new File("test.txt");
        if(file.exists()) {

            Scanner scanner = null;
            try {
                scanner = new Scanner(file);
            } catch (FileNotFoundException e) {
                throw new FileNotExistsExeption("Plik nie istnieje");
            }
            System.out.println(scanner.nextLine());
        }else {


            throw  new FileNotExistsExeption("Plik nie istnieje");

        }
        //FileWriter writer=new FileWriter(file);
       // writer.write("To jest test");
      //  writer.close();
    }
}


      /*  File file=new File("test.txt");
        boolean exist=file.exists();
        try {
            Scanner scanner=new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

       */
