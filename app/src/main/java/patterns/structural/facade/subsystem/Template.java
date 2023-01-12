package patterns.structural.facade.subsystem;

public abstract class Template
{
    public enum TemplateType {Email, Newsletter};

    public abstract String format (Object obj);
}
