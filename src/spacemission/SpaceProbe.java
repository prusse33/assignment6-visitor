package spacemission;

/**
 * Concrete Element: an unmanned space probe.
 */
public class SpaceProbe implements SpaceAsset {
    private final String name;
    private final double massKg;
    private final double powerWatts;

    public SpaceProbe(String name, double massKg, double powerWatts) {
        this.name = name;
        this.massKg = massKg;
        this.powerWatts = powerWatts;
    }

    public String getName() {
        return name;
    }

    public double getMassKg() {
        return massKg;
    }

    public double getPowerWatts() {
        return powerWatts;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSpaceProbe(this);
    }
}
