public class Place {
    private String name;
    private int xCoordinate;
    private int yCoordinate;
    private Boolean containsChest;
    public Boolean access;
    

    /**
     * 
     * @param name name of place
     * @param xCoordinate x coordinate of place
     * @param yCoordinate y coordinate of place
     */
    public Place(String name, int xCoordinate, int yCoordinate, Boolean containsChest){
        this.name = name;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.containsChest = containsChest;
    }
    
    /**
     * 
     * @return true if place contains chest
     */
    public Boolean getContainsChest() {
        return containsChest;
    }

    /**
     * 
     * @return name of the place
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @return x coordinate of the place
     */
    public int getxCoordinate() {
        return xCoordinate;
    }

    /**
     * 
     * @return y coordinate of the place
     */
    public int getyCoordinate() {
        return yCoordinate;
    }

    /**
     * Sets new x coordinate
     * @param xCoordinate
     */
    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }
    /**
     * Sets new y coordinate
     * @param yCoordinate
     */
    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
    
    /**
     * sets new status of containsChests
     * @param containsChest
     */
    public void setContainsChest(Boolean containsChest) {
        this.containsChest = containsChest;
    }
    
    /**
     * looks in particular place where player is to see if it contains a chest
     * @param player player looking for chests
     * @param campusMap map of place
     * @param places places to look in
     * @return
     */
    public Boolean lookForChest(Player player, CampusMap campusMap, Place[] places){
        Place tempLocation = player.getCurrentLocationPlace(campusMap, player.getxPlayer(), player.getyPlayer(), places);
        if (tempLocation.getContainsChest()) {
            System.out.println("You have found a chest!");
            return true;
        }
        return false;
    }
    
    /**
     * looks in particular place where player is to see if it contains a person
     * @param player player looking for people
     * @param campusMap map of place
     * @param persons people to look for
     * @param places places to look in
     */
    public void lookForPeople(Player player, CampusMap campusMap, Person[] persons, Place[] places){
        Place tempLocation = player.getCurrentLocationPlace(campusMap, player.getxPlayer(), player.getyPlayer(), places);
        for (Person person : persons) {
             if (tempLocation==person.getPersonLocation()) {
                System.out.println("There is someone here!");
                break;
             }
        }
    }
}
    
    