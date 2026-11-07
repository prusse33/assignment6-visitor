package spacemission;

/**
 * Another Concrete Visitor: creates a short inventory summary.
 */
public class MissionSummaryVisitor implements Visitor {
    private int assetCount;

    @Override
    public void visitSatellite(Satellite satellite) {
        assetCount++;
        System.out.println("Inventory: satellite - " + satellite.getName());
    }

    @Override
    public void visitRover(Rover rover) {
        assetCount++;
        System.out.println("Inventory: rover - " + rover.getName());
    }

    @Override
    public void visitSpaceProbe(SpaceProbe spaceProbe) {
        assetCount++;
        System.out.println("Inventory: space probe - " + spaceProbe.getName());
    }

    public int getAssetCount() {
        return assetCount;
    }
}
