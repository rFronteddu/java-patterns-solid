package patterns.builder;

import lombok.Getter;
import lombok.Setter;

/**
 * Entity class we will use to test the builder example
 */
@Setter @Getter
public class Address
{
    private String houseNumber;
    private String street;
    private String city;
    private String zipCode;
    private String state;
}
