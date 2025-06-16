public class ElementVisit implements PaintingVisitor{
    int counter = 0;
    @Override
    public void visit(Kite kite){counter++;}

    @Override
    public void visit(Boat boat) {counter++;}

    @Override
    public void visit(Flag flag){counter++;}

    @Override
    public void visit(Tree tree) {counter++;}

    @Override
    public void visit(Kid kid) {counter++;}

    @Override
    public void visit(Lake lake){counter++;}

    @Override
    public void visit(Island island) {counter++;}
}
