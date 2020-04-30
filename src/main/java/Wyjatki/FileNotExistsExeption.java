package Wyjatki;

public class FileNotExistsExeption extends RuntimeException {
    public FileNotExistsExeption(String message) {
        super(message);
    }
}
