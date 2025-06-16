import java.util.List;

public class Lake extends Element {
    public String name;
    public double diameterLake;
    public List<Element> lakeElementsList;
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
    public void accept(PaintingVisitor paintingVisitor) {
        paintingVisitor.visit(this);
    for (Element element : lakeElementsList)
    {
            element.accept(paintingVisitor);
        }}
}
