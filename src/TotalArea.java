/**
 * Visitor that accumulates the total area covered by elements.
 */
public class TotalArea implements PaintingVisitor{
    /** Running area sum. */
    public double totalAreaCounter = 0;
    @Override
    public void visit(Kite kite) {
        double kiteArea = 0.5 * (kite.length * kite.width);
        totalAreaCounter += kiteArea;

    }

    @Override
    public void visit(Boat boat) {
        double w= boat.width;
        double l = boat.length;
        double d3 = w * (l - w * 0.5);
        double boatArea = d3 + Math.PI * (Math.pow(w / 2, 2)) * 0.5;
        totalAreaCounter += boatArea;

    }

    @Override
    public void visit(Flag flag) {
        double flagArea = flag.width * flag.length;
        totalAreaCounter += flagArea;

    }

    @Override
    public void visit(Tree tree) {
        double W = tree.width;
        double H = tree.length;
        double treeArea = 0.5 * (W * H);
        totalAreaCounter += treeArea;

    }

    @Override
    public void visit(Kid kid) {
        double w = kid.width;
        double l = kid.length;
        double d3 = w * (l - w);
        double kidArea = d3 + Math.PI * (Math.pow(w * 0.5, 2));
        totalAreaCounter += kidArea;

    }

    @Override
    public void visit(Lake lake) {
        double lakeArea = Math.PI * Math.pow(0.5 * lake.diameterLake, 2);
        totalAreaCounter += lakeArea;

    }

    @Override
    public void visit(Island island) {
        double islandArea = Math.PI * Math.pow(0.5 * island.diameterIsland, 2);
        totalAreaCounter += islandArea;

    }
}
