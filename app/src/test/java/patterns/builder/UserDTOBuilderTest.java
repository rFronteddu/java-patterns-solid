package patterns.builder;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class UserDTOBuilderTest
{
    @Test public void buildTest () {
        var builder = new UserWebDTOBuilder ();
        var user = createUser ();
        var dto = directorBuild (builder, user);
        assertEquals (dto.getName (), user.getFirstName () + " " + user.getLastName ());
    }

    private static UserDTO directorBuild (UserDTOBuilder builder, User existingUser) {
        return builder.withFirstName (existingUser.getFirstName ())
                .withAddress (existingUser.getAddress ())
                .withBirthday (existingUser.getBirthDay ())
                .withFirstName (existingUser.getFirstName ())
                .withLastName (existingUser.getLastName ()).build ();
    }

    /**
     * @return a sample user
     */
    public static User createUser () {
        User user = new User ();
        user.setBirthDay (LocalDate.of (1960, 5, 6));
        user.setFirstName ("joe");
        user.setLastName ("black");
        Address address = new Address ();
        address.setHouseNumber ("120");
        address.setStreet ("Romana");
        address.setCity ("Baltimora");
        address.setState ("Indiana");
        address.setZipCode ("23456");
        user.setAddress (address);
        return user;
    }
}