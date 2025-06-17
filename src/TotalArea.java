public class TotalArea implements PaintingVisitor{
    public double totalAreaCounter = 0;
    @Override
    public void visit(Kite kite) {
        double kiteArea = 0.5 * (kite.length * kite.width);
        totalAreaCounter += kiteArea;

    }

    @Override
    public void visit(Boat boat) {
        double w= boat.getWidth();
        double l = boat.getLength();
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
        double W = tree.getWidth();
        double H = tree.getLength();


        double rectArea    = (W/2) * H;
        double triArea     = 0.5 * W * H;
        double treeArea    = rectArea + triArea;
        totalAreaCounter += treeArea;

    }

    @Override
    public void visit(Kid kid) {
        double w = kid.getWidth();
        double l = kid.getLength();
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
