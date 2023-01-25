package patterns.behavioral.visitor;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PerformanceRating
{
    private final int id;
    private final int personalRating;
    private int teamAverageRating;
    private int finalRating;

    public PerformanceRating(final int id, final int personalRating) {
        this.id = id;
        this.personalRating = personalRating;
    }
}
