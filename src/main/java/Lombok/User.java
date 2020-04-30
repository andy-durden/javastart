package Lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private long id;
    private String name;
    private String lastName;
    private String password;
    private ZonedDateTime creationDate;
    private ZonedDateTime activationDate;
    private ZonedDateTime delitionDate;
    private boolean activated;


}