 
/**
 * Element representing a flag with a colored fabric and a pole height.
 */
public class Flag extends Element {

    /** Color of the flag. */
    Color color;
    /** Height of the flag pole. */
    int carrierHeight;

    /**
     * Constructs a flag instance.
     */
    public Flag(double width, double length, Color color, int carrierHeight, String path) {
        super(width, length, path);
        this.color = color;
        this.carrierHeight = carrierHeight;
    }

 
    public Color getColor() {
        return color;
    }

    public int getCarrierHeight() {
        return carrierHeight;
    }

    @Override
    public String getName() {
        return Flag.class.getSimpleName().toLowerCase();
    }

    @Override
    public Habitat getHabitat() {
        return Habitat.TERRESTRIAL;
    }
    public void accept(PaintingVisitor paintingVisitor) {paintingVisitor.visit(this);}
}
