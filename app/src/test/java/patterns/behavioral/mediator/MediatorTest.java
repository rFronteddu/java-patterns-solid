package patterns.behavioral.mediator;

import org.junit.Test;

public class MediatorTest
{
    @Test public void mediatorTests() {
        UIMediator mediator = new UIMediator ();
        TextBox c1 = new TextBox (mediator, "t1");
        TextBox c2 = new TextBox (mediator, "t2");
        TextBox c3 = new TextBox (mediator, "t3");
        // simulates a callback
        c1.textChanged ("new text");
    }
}