package patterns.behavioral.mediator;

// abstract colleague
public interface UIControl
{
    void controlChanged (UIControl control);

    String getControlValue ();

    String getControlName ();
}
