package spacemission;

/**
 * Concrete Element: an artificial satellite.
 */
public class Satellite implements SpaceAsset {
    private final String name;
    private final double massKg;
    private final double powerWatts;

    public Satellite(String name, double massKg, double powerWatts) {
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
        visitor.visitSatellite(this);
    }
}
