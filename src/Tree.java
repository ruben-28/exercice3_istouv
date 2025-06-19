
/**
 * Element representing a tree with a certain number of leaves.
 */
public class Tree extends Element {

    /** Number of leaves on the tree. */
    int leavesAmount;

    public int getLeavesAmount() {
        return leavesAmount;
    }

    /**
     * Constructs a tree instance.
     */
    public Tree(double width, double height, int leavesAmount, String path) {
        super(width, height, path);
        this.leavesAmount = leavesAmount;
    }

    @Override
     public String getName() {
        return "tree";
    }

    @Override
    public Habitat getHabitat() {
        return Habitat.TERRESTRIAL;
    }


    public void accept(PaintingVisitor paintingVisitor) {
        paintingVisitor.visit(this);
    }

}
