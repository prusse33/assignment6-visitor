package spacemission;

import java.util.List;

/**
 * Client: creates the object structure and applies different visitors.
 */
public class Main {
    public static void main(String[] args) {
        List<SpaceAsset> missionAssets = List.of(
                new Satellite("Orbiter-1", 850.0, 1200.0),
                new Rover("Explorer-2", 950.0, 750.0),
                new SpaceProbe("Voyager-X", 600.0, 500.0)
        );

        System.out.println("=== MASS REPORT ===");
        MassReportVisitor massVisitor = new MassReportVisitor();
        for (SpaceAsset asset : missionAssets) {
            asset.accept(massVisitor);
        }
        System.out.printf("Total mass: %.1f kg%n%n", massVisitor.getTotalMassKg());

        System.out.println("=== POWER REPORT ===");
        PowerConsumptionVisitor powerVisitor = new PowerConsumptionVisitor();
        for (SpaceAsset asset : missionAssets) {
            asset.accept(powerVisitor);
        }
        System.out.printf("Total power consumption: %.1f W%n%n",
                powerVisitor.getTotalPowerWatts());

        System.out.println("=== MISSION INVENTORY ===");
        MissionSummaryVisitor summaryVisitor = new MissionSummaryVisitor();
        for (SpaceAsset asset : missionAssets) {
            asset.accept(summaryVisitor);
        }
        System.out.println("Total assets: " + summaryVisitor.getAssetCount());
    }
}
