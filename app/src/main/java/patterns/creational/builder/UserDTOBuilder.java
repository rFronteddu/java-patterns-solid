package patterns.creational.builder;

import java.time.LocalDate;

/*
 * Identify the parts of the product and provide methods to create those parts
 * Provide a method to assemble or build the product/object
 * Provide a way/method to get fully built object out. Optionally, builder can keep
 * a reference to a product it has built so the same can be returned again in the future.
 *
 * If needed, implement the Director as a separate class (otherwise the client can play the
 * role of director)
 *
 * abstract builder, returns an instance of the builder to enable
 * method chaining
 */
public interface UserDTOBuilder
{
    // methods to build parts o the product
    UserDTOBuilder withFirstName (final String firstName);

    UserDTOBuilder withLastName (final String lastName);

    UserDTOBuilder withBirthday (final LocalDate date);

    UserDTOBuilder withAddress (final Address address);

    // assembles final product
    UserDTO build ();

    // fetch already built object
    UserDTO getUserDTO ();
}
