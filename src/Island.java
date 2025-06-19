// TODO: Implement Composite (change this file).

/**
 * Composite element representing an island that can contain other elements.
 */
public class Island extends Element {
    public String name;
    public double diameterIsland;
    public java.util.List<Element> islandElementsList;

    /**
     * Creates an island with the given name and diameter.
     */
    public Island(String name, double diameter, String path) {
        super(diameter, diameter, path);
        this.name = name;
        this.diameterIsland = diameter;
        this.islandElementsList = new java.util.ArrayList<>();
    }

    @Override
    public String getName() {
        //TODO: fix
        return this.name;
    }

    @Override
    public Habitat getHabitat() {
        return Habitat.AQUATIC;
    }

    /**
     * Accepts a visitor and delegates to all contained elements.
     */
    public void accept(PaintingVisitor paintingVisitor) {
        paintingVisitor.visit(this);
        for (Element element : islandElementsList) {
            element.accept(paintingVisitor);
        }
    }

}
