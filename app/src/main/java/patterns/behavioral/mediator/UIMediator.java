package patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

// mediator
public class UIMediator
{
    List<UIControl> colleagues = new ArrayList<> ();

    public void register (final UIControl control) {
        System.out.println ("Control " + control.getControlName () + " registered.");
        colleagues.add (control);
    }

    public void valueChanged (final UIControl control) {
        colleagues.stream ().filter (c -> c != control).forEach (c -> c.controlChanged (control));
    }
}
