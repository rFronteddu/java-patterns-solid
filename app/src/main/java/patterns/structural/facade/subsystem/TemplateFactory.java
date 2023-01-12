package patterns.structural.facade.subsystem;

public class TemplateFactory
{
    public static Template createTemplateFor (final Template.TemplateType type) {
        switch (type) {
            case Email:
                return new OrderEmailTemplate ();
            default:
                throw new IllegalArgumentException ("Unknown TemplateTYpe");
        }
    }
}
