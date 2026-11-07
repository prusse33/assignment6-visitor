package spacemission;

/**
 * Concrete Visitor: reports the power consumption of each asset
 * and calculates the total power consumption.
 */
public class PowerConsumptionVisitor implements Visitor {
    private double totalPowerWatts;

    @Override
    public void visitSatellite(Satellite satellite) {
        totalPowerWatts += satellite.getPowerWatts();
        System.out.printf("Satellite %s uses %.1f W%n",
                satellite.getName(), satellite.getPowerWatts());
    }

    @Override
    public void visitRover(Rover rover) {
        totalPowerWatts += rover.getPowerWatts();
        System.out.printf("Rover %s uses %.1f W%n",
                rover.getName(), rover.getPowerWatts());
    }

    @Override
    public void visitSpaceProbe(SpaceProbe spaceProbe) {
        totalPowerWatts += spaceProbe.getPowerWatts();
        System.out.printf("Space probe %s uses %.1f W%n",
                spaceProbe.getName(), spaceProbe.getPowerWatts());
    }

    public double getTotalPowerWatts() {
        return totalPowerWatts;
    }
}
