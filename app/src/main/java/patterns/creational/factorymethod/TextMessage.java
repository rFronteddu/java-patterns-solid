package patterns.creational.factorymethod;

public class TextMessage extends Message
{
    @Override public String getContent () {
        return "Text";
    }
}
