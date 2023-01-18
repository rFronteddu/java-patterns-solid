package patterns.behavioral.mediator;

import lombok.Getter;

@Getter
public class TextBox implements UIControl
{
    UIMediator mediator;
    String name, text;
    private boolean mediatedUpdate;

    public TextBox (final UIMediator mediator, final String name) {
        this.mediator = mediator;
        this.name = name;
        text = ";";
        this.mediator.register (this);
    }

    // this should be a listener on text, for simplicity I am going to call this manually
    public void textChanged (String change) {
        // breaks the change chain if the change comes from this class
        if (!mediatedUpdate) {
            text = change;
            mediator.valueChanged (this);
        } else {
            System.out.println ("I am " + this.getControlName () + " I was notified of a change but I am mediatedUpdate");
        }
    }

    @Override public void controlChanged (final UIControl control) {
        // this would trigger the callback
        mediatedUpdate = true;
        text = control.getControlValue ();
        System.out.println ("I am " + this.getControlName () + " I noticed a change in " + control.getControlName () + " change: " + text);
        textChanged (text);
        mediatedUpdate = false;
    }

    @Override public String getControlValue () {
        return text;
    }

    @Override public String getControlName () {
        return name;
    }
}
