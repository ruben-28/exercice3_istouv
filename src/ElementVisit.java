public class ElementVisit implements PaintingVisitor{
    int elementCounter = 0;
    @Override
    public void visit(Kite kite){
        elementCounter++;}

    @Override
    public void visit(Boat boat) {
        elementCounter++;}

    @Override
    public void visit(Flag flag){
        elementCounter++;}

    @Override
    public void visit(Tree tree) {
        elementCounter++;}

    @Override
    public void visit(Kid kid) {
        elementCounter++;}

    @Override
    public void visit(Lake lake){
        elementCounter++;}

    @Override
    public void visit(Island island) {
        elementCounter++;}
}
