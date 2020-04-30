package Lombok;

import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {


        User user = User.builder()
                .name("Bartek")
                .lastName("Papiewski")
                .activated(false)
                .activationDate(ZonedDateTime.now())
                .delitionDate(ZonedDateTime.now())
                .build();

    }
}
