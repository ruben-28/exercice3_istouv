 
/**
 * Element representing a boat within a lake.
 */
public class Boat extends Element{
    /** Material used to build the boat. */
    Material material;

    /**
     * Constructs a boat with the given dimensions and material.
     *
     * @param width   width of the boat
     * @param length  length of the boat
     * @param m       boat material
     * @param path    hierarchical path in the painting
     */
    public Boat(double width, double length, Material m, String path) {
        super(width, length, path);
        this.material=m;
    }

    /** @return the boat material */
    public Material getMaterial() {
        return material;
    }

    public String getName() {
        return "boat";
    }

    @Override
    public Habitat getHabitat() {
        return Habitat.AQUATIC;
    }

    public void accept(PaintingVisitor paintingVisitor) {
        paintingVisitor.visit(this);
    }
}
