 
/**
 * Base class for all elements that can appear in a painting.
 */
public abstract class Element{
    protected double width;
    protected double length;
    private String path;
    private String name;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    /**
     * Creates an element.
     *
     * @param width  element width
     * @param length element length
     * @param path   path of the parent element in the hierarchy
     */
    public Element(double width, double length, String path) {
        this.width = width;
        this.length = length;
        this.path= path==null?"":path;
    }


    /** @return hierarchical path of this element */
    public String getPath(){
        return path;
    }
    /** @return full path including this element's name */
    public String getFullName(){
        return path.isEmpty()? getName() : path+"/"+getName();
    }
    public abstract String getName();
    public abstract Habitat getHabitat();
    public abstract void accept(PaintingVisitor paintingVisitor);

}
