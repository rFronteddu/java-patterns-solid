package patterns.builder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Product class in our building design pattern example
 * i.e. we are going to create objects of this class using the builder
 */
@AllArgsConstructor @Getter @Setter
public class UserWebDTO implements UserDTO
{
    private String name;
    private String address;
    private String age;
}
