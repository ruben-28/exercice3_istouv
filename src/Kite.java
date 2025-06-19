import java.awt.*;

/**
 * Simple kite element flying above the island.
 */
public class Kite extends Element {
    /** Color of the kite. */
    Color color;

    /**
     * Constructs a kite.
     */
    public Kite(double width, double height, Color color, String path) {
        super(width, height, path);
        this.color = color;
    }

     public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
	
    @Override
    public String getName() {
        return "kite";
    }

    @Override
    public Habitat getHabitat() {
        return Habitat.TERRESTRIAL;
    }

    public void accept(PaintingVisitor paintingVisitor) {
        paintingVisitor.visit(this);
    }
}
