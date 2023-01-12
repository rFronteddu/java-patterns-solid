package patterns.structural.facade.subsystem;

public class StationaryFactory
{
    public static Stationary createStationary() {
        return new HalloweenStationary();
    }
}
