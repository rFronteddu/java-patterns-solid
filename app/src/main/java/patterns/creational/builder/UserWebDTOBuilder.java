package patterns.creational.builder;

import java.time.LocalDate;
import java.time.Period;

/**
 * Concrete builder for UserWebDTO
 */
public class UserWebDTOBuilder implements UserDTOBuilder
{
    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDTO dto;

    @Override public UserDTOBuilder withFirstName (final String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override public UserDTOBuilder withLastName (final String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override public UserDTOBuilder withBirthday (final LocalDate date) {
        Period ageInYears = Period.between (date, LocalDate.now ());
        this.age = Integer.toString (ageInYears.getYears ());
        return this;
    }

    @Override public UserDTOBuilder withAddress (final Address address) {
        this.address = address.getHouseNumber () + ", " + address.getStreet () +
                ", " + address.getCity () + ", " + address.getState () + ", " +
                address.getZipCode ();
        return this;
    }

    @Override public UserDTO build () {
        dto = new UserWebDTO (firstName + " " + lastName, address, age);
        return dto;
    }

    @Override public UserDTO getUserDTO () {
        return dto;
    }
}
