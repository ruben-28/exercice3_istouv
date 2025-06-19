import static java.lang.System.out;

/**
 * Visitor that prints only the full name of each element.
 */
public class ShortPrint implements PaintingVisitor {

    @Override
    public void visit(Kite kite) {
        out.println(kite.getFullName());
    }

    @Override
    public void visit(Boat boat) {
        out.println(boat.getFullName());

    }

    @Override
    public void visit(Flag flag) {
        out.println(flag.getFullName());

    }

    @Override
    public void visit(Tree tree) {
        out.println(tree.getFullName());

    }

    @Override
    public void visit(Kid kid) {
        out.println(kid.getFullName());

    }

    @Override
    public void visit(Lake lake) {
        out.println(lake.getFullName());

    }

    @Override
    public void visit(Island island) {
        out.println(island.getFullName());

    }
}
