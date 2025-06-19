import java.util.List;

/**
 * Composite element representing a lake that may contain other elements.
 */
public class Lake extends Element {
    public String name;
    public double diameterLake;
    public List<Element> lakeElementsList;
    /**
     * Creates a lake with the given name and diameter.
     */
    public Lake(String name, double diameter, String path) {
        //TODO: fix
        super(diameter,diameter,path);
        this.name = name;
        this.diameterLake = diameter;
        this.lakeElementsList = new java.util.ArrayList<>();
    }

    @Override
    public String getName() {
        //TODO: fix
        return this.name;

    }

    @Override
    public Habitat getHabitat() {
        return Habitat.TERRESTRIAL;
    }
    /**
     * Accepts a visitor and applies it to all contained elements.
     */
    public void accept(PaintingVisitor paintingVisitor) {
        paintingVisitor.visit(this);
        for (Element element : lakeElementsList) {
            element.accept(paintingVisitor);
        }
    }
}
