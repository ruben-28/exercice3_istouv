 
/**
 * Element representing a child that can appear on land or in water.
 */
public class Kid extends Element {
    private int birthYear;
    private Color hairColor;

    /**
     * Constructs a kid element.
     */
    public Kid(double width, double height, int birthYear, Color hairColor, String path) {
        super(width, height, path);
        this.birthYear = birthYear;
        this.hairColor = hairColor;
    }

 
    public int getBirthYear() {
        return birthYear;
    }

    public Color getHairColor() {
        return hairColor;
    }

    @Override
    public String getName() {
        return "kid";
    }

    @Override
    public Habitat getHabitat() {
        return Habitat.AMPHIBIAN;
    }

    public void accept(PaintingVisitor paintingVisitor) {
        paintingVisitor.visit(this);
    }
}
