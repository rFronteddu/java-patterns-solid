package patterns.behavioral.visitor;

import lombok.Getter;

public class Programmer extends AbstractEmployee
{
    @Getter
    private final String skill;

    public Programmer (final String name, final String skill) {
        super (name);
        this.skill = skill;
    }

    public @Override void accept (final Visitor visitor) {
        visitor.visit (this);
    }
}
