package patterns.structural.adapter.classadapteer;

import lombok.Getter;
import lombok.Setter;

/**
 * Adaptee
 */
@Getter @Setter
public class Employee
{
    private String fullName;

    private String jobTitle;

    private String officeLocation;
}
