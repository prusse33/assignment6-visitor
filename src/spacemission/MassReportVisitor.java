package spacemission;

/**
 * Concrete Visitor: calculates the total mass of all visited assets.
 */
public class MassReportVisitor implements Visitor {
    private double totalMassKg;

    @Override
    public void visitSatellite(Satellite satellite) {
        totalMassKg += satellite.getMassKg();
        System.out.printf("Satellite %s: %.1f kg%n",
                satellite.getName(), satellite.getMassKg());
    }

    @Override
    public void visitRover(Rover rover) {
        totalMassKg += rover.getMassKg();
        System.out.printf("Rover %s: %.1f kg%n",
                rover.getName(), rover.getMassKg());
    }

    @Override
    public void visitSpaceProbe(SpaceProbe spaceProbe) {
        totalMassKg += spaceProbe.getMassKg();
        System.out.printf("Space probe %s: %.1f kg%n",
                spaceProbe.getName(), spaceProbe.getMassKg());
    }

    public double getTotalMassKg() {
        return totalMassKg;
    }
}
