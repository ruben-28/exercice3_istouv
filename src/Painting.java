 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Root container storing all elements of a painting.
 */
public class Painting {
    Map<String, Element> pathToElementMap;
    List<Element> elementList;
    /** Default constructor. */
    Painting(){
        elementList=new ArrayList<>();
        pathToElementMap = new HashMap<>();
    }
    /**
     * Adds an element to the painting hierarchy.
     */
    public void addElement(Element element){
        pathToElementMap.put(element.getFullName(), element);
        if (element.getPath().isEmpty()){
            elementList.add(element);
        }
        else {
            Element containingElement = pathToElementMap.get(element.getPath());
			//TODO: add element as a child of containingElement
            if (containingElement instanceof Island) {
                Island island = (Island) containingElement;

                if (element.getHabitat() == Habitat.AQUATIC) {
                    System.out.println(island.getName()
                            + " cannot contain "
                            + element.getName());
                } else {
                    island.islandElementsList.add(element);
                }
            } else if (containingElement instanceof Lake) {
                Lake lake = (Lake) containingElement;

                if (element.getHabitat() == Habitat.TERRESTRIAL) {
                    System.out.println(lake.getName()
                            + " cannot contain "
                            + element.getName());
                } else {
                    lake.lakeElementsList.add(element);
                }
            }
        }
    }

    public String getName() {
        return Painting.class.getSimpleName().toLowerCase();
    }


}
