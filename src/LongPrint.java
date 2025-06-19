
/**
 * Visitor that builds a long descriptive string for every element.
 */
public class LongPrint implements PaintingVisitor {
    /** Accumulated description. */
    public String longPrint = "";
    @Override
    public void visit(Kite kite) {
        this.longPrint += "A kite of color: "
                + kite.color.toString().toLowerCase()
                + ". ";
    }

    @Override
    public void visit(Boat boat) {
        this.longPrint += "A boat made of "
                + boat.getMaterial()
                + " material. ";

    }

    @Override
    public void visit(Flag flag) {
        this.longPrint += "A flag with color: "
                + flag.color.toString().toLowerCase()
                + " of height " + flag.carrierHeight
                + ". ";

    }

    @Override
    public void visit(Tree tree) {
        this.longPrint += "A tree with an amount of "
                + tree.getLeavesAmount()
                + " leaves. ";

    }

    @Override
    public void visit(Kid kid) {
        int age = (2023 - kid.getBirthYear() );
        this.longPrint += "A "
                + age
                + " year old kid with "
                + kid.getHairColor().toString().toLowerCase()
                + " hair. ";

    }

    @Override
    public void visit(Lake lake) {
        if (lake.lakeElementsList.isEmpty()) {
            this.longPrint += "An empty lake named "
                    + lake.getName() +
                    ". ";
        } else {
            this.longPrint += "A lake named "
                    + lake.getName()
                    + " containing ";
        }

    }

    @Override
    public void visit(Island island) {
        if (island.islandElementsList.isEmpty()) {
            this.longPrint += "An empty island named "
                    + island.getName() +
                    ". ";
        } else {
            this.longPrint += "An island named "
                    + island.getName()
                    + " containing ";
        }


    }
}
