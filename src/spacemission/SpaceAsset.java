package spacemission;

/**
 * Element interface in the Visitor pattern.
 * Every space asset accepts a visitor.
 */
public interface SpaceAsset {
    void accept(Visitor visitor);
}
