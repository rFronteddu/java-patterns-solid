package patterns.creational.factorymethod;

/**
 * This is our abstract creator. The abstract method
 * createMessage() has to be implemented by its subclasses.
 */
public abstract class MessageCreator
{
    public Message getMessage () {
        Message msg = createMessage ();
        // additional processing on the object - non-mandatory
        msg.addDefaultHeaders ();
        msg.encrypt ();

        return msg;
    }

    // factory method
    public abstract Message createMessage ();
}
