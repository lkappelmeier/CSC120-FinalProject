//import java.lang.reflect.Array;
public class CampusMap {
    /** Array of type Place */
    private Place[] places;
    
    /**
     * Constructor for a CampusMap
     * @param places contained in CampusMap
     */
    public CampusMap(Place[] places){
        this.places = places;

    }

    /**
     * Prints Array of Places
     * @return Array of type Place
     */
    public Place[] getPlaces() {
        System.out.println(places);
        return places;
    }

  
    /**
     * returns the String name of the place by using coordinates
     * @param x integer coordinate
     * @param y integer coordinate
     * @param places Array of Places to iterate through
     * @return String name of place
     */
    public String getStringPlaceFromCoordinates(int x, int y, Place[] places){
        for (int i = 0; i < places.length; i++) {
            int tempX = places[i].getxCoordinate();
            int tempY = places[i].getyCoordinate();
                if (tempX == x && tempY ==y) {
                    //System.out.println("You are at " + places[i].getName());
                    return places[i].getName();
                }
                if (i==places.length) {
                    System.out.println("nothing found");
                }
        } 
        return null;
    }

    /**
     * gets Place from array of places that match coordinates
     * @param x integer coordinate
     * @param y integer coordinate
     * @param places Array of Places to iterate through
     * @return Place 
     */
    public Place getPlaceFromCoordinates(int x, int y, Place[] places){
        for (int i = 0; i < places.length; i++) {
            int tempX = places[i].getxCoordinate();
            int tempY = places[i].getyCoordinate();
                if (tempX == x && tempY ==y) {
                    //System.out.println("You are at " + places[i].getName());
                    return places[i];
                }
                if (i==places.length) {
                    System.out.println("nothing found");
                }
        } 
        return null;
    }
    
    
}

