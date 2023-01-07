package patterns.builder;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Entity class we will use to test the builder example
 */
@Getter @Setter
public class User
{
    private String firstName;
    private String lastName;
    private LocalDate birthDay;
    private Address address;
}
