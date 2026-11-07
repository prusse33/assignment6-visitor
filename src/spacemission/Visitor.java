package spacemission;

/**
 * Visitor interface.
 * It declares one visit method for every concrete element type.
 */
public interface Visitor {
    void visitSatellite(Satellite satellite);
    void visitRover(Rover rover);
    void visitSpaceProbe(SpaceProbe spaceProbe);
}
