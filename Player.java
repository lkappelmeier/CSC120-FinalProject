import java.util.ArrayList;
public class Player {
    private int charisma;
    private int logic;
    private int fitness;
    private int creativity;
    private ArrayList<Item> inventory;
    private int xPlayer;
    private int yPlayer;
    public String currentLocation;
    public Place currentLocationPlace;
    public CampusMap campusMap;
    /**
     * sets charisma, logic, fitness, and creativity to zero at start
     * sets start coordinates to Burton
     * initializes arraylist  
     */
    public Player(){
        this.charisma = 0;
        this.logic = 0;
        this.fitness = 0;
        this.creativity = 0;
        this.xPlayer = 9;
        this.yPlayer = 11;
        this.inventory = new ArrayList<>();
    }

    /**
     * 
     * @return charisma points
     */
    public int getCharisma() {
        return charisma;
    }
    
    /**
     * 
     * @return creativity points
     */
    public int getCreativity() {
        return creativity;
    }

    /**
     * 
     * @return fitness points
     */
    public int getFitness() {
        return fitness;
    }

    /**
     * 
     * @return inventory in form of ArrayList of Items
     */
    public ArrayList<Item> getInventory() {
        return inventory;
    }

    /**
     * 
     * @return logic points
     */
    public int getLogic() {
        return logic;
    }

    /**
     * 
     * @return x coordinate of player
     */
    public int getxPlayer() {
        return xPlayer;
    }

    /**
     * 
     * @return y coordinate of player
     */
    public int getyPlayer() {
        return yPlayer;
    }

    /**
     * sets new charisma points
     * @param charisma
     */
    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    /**
     * sets new creativity points
     * @param creativity
     */
    public void setCreativity(int creativity){
        this.creativity = creativity;
    }
    /**
     * sets new fitness points
     * @param fitness
     */
    public void setFitness(int fitness) {
        this.fitness = fitness;
    }
    /**
     * sets new logic points
     * @param logic
     */
    public void setLogic(int logic) {
        this.logic = logic;
    }

    /**
     * sets new x coordinate for player
     * @param x coordinate
     * @return new x coordinate
     */
    public int setxPlayer(int x) {
        this.xPlayer = x;
        return xPlayer;
    }

    /**
     * sets new y coordinate for player
     * @param y coordinate
     * @return new y coordinate
     */
    public int setyPlayer(int y) {
        this.yPlayer = y;
        return yPlayer;
    }
   
    /**
     * sets the string of current location
     * @param currentLocation
     */
    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    /**
     * sets the place of current location
     * @param currentLocationPlace
     */
    public void setCurrentLocationPlace(Place currentLocationPlace) {
        this.currentLocationPlace = currentLocationPlace;
    }

    /**
     * calculates and returns total points
     * @return sum of charisma, creativity, fitness, and logic
     */
    public int getTotalPoints(){
        int totalPoints = getCharisma() + getCreativity() + getFitness() + getLogic();
        return totalPoints;
    }
    
    /**
     * prints all individual points and total points
     */
    public void printAllPoints(){
        System.out.println("Charisma: " + getCharisma());
        System.out.println("Fitness: " + getFitness());
        System.out.println("Creativity: " + getCreativity());
        System.out.println("Logic: " + getLogic());
        System.out.println("Total Points: " + getTotalPoints());
    }

    /**
     * gets string of current locaiton
     * @param campusMap
     * @param x coordinate
     * @param y coordinate
     * @param places array of places
     * @return
     */
    public String getStringCurrentLocation(CampusMap campusMap, int x, int y, Place[] places) {
        this.currentLocation = campusMap.getStringPlaceFromCoordinates(x, y, places);
        return currentLocation;
    }

     /**
     * gets place of current locaiton
     * @param campusMap
     * @param x coordinate
     * @param y coordinate
     * @param places array of places
     * @return
     */
    public Place getCurrentLocationPlace(CampusMap campusMap, int x, int y, Place[] places) {
        this.currentLocationPlace = campusMap.getPlaceFromCoordinates(x, y, places);
        return currentLocationPlace;
    }
 
    /**
     * adds item to inventory
     * @param itemName
     */
     public void pickUpItem(Item itemName){
        ArrayList<Item> inventory = new ArrayList<>();
        inventory.add(itemName);
    }

    /**
     * drops given item name from inventory
     * @param itemName
     */
    public void dropItem(Item itemName){
        ArrayList<Item> inventory = new ArrayList<>();
        inventory.remove(itemName);
    }
    /**
     * checks requirements for win (having certain number of points, or being in a certain location)
     * checks for loss (falling in pond)
     * @param places
     * @param campusMap
     * @return
     */
    public Boolean checkForWin(Place[] places, CampusMap campusMap){
        if (getTotalPoints()==25|getCharisma()==10|getCreativity()==10|getFitness()==10|getLogic()==10) {
            System.out.println("You have earned enough points and have won the game!");
            printAllPoints();
            return true;
        }
        if (getStringCurrentLocation(campusMap, getxPlayer(), getyPlayer(), places).equals("PVTA")) {
            System.out.println("You have made it to the B43 and can now flee to Amherst! You won!");
            printAllPoints();
            return true;
        }
        if (getStringCurrentLocation(campusMap, getxPlayer(), getyPlayer(), places).equals("Pond")) {
            System.out.println("Oh no! You fell in the pond! You lose.");
            printAllPoints();
        }
        return false;
    }

    /**
     * takes the user input and adjusts player position based on movement
     * @param movement
     * @param places
     * @param campusMap
     */
    public void move(String movement, Place[] places, CampusMap campusMap){
        if (movement.contains("north")) {
            xPlayer--;
        }
        if (movement.contains("east")) {
            yPlayer++;
        }
        if (movement.contains("south")) {
            xPlayer++;
        }
        if (movement.contains("west")) {
            yPlayer--;
        }
        if (!(movement.contains("north")||movement.contains("east")||movement.contains("south")||movement.contains("west"))) {
            System.out.println("Please supply valid direction");
        }
        setCurrentLocationPlace(campusMap.getPlaceFromCoordinates(xPlayer, yPlayer, places));
        setCurrentLocation(campusMap.getStringPlaceFromCoordinates(xPlayer, yPlayer, places));
        System.out.println("You are located at " + currentLocation);
    }

    /**
     * undos whatever the previous move was
     * @param movement
     * @param places
     * @param campusMap
     */
    public void undoMove(String movement, Place[] places, CampusMap campusMap){
        //check for valid location
            if (movement.contains("north")) {
                xPlayer++;
            }
            if (movement.contains("east")) {
                yPlayer--;
            }
            if (movement.contains("south")) {
                xPlayer--;
            }
            if (movement.contains("west")) {
                yPlayer++;
            }
            setCurrentLocationPlace(campusMap.getPlaceFromCoordinates(xPlayer, yPlayer, places));
            setCurrentLocation(campusMap.getStringPlaceFromCoordinates(xPlayer, yPlayer, places));
            System.out.println("You are back at your location at " + currentLocation);
    }

    /**
     * checks to see if the move is valid based on if the location exists and if permissions are granted
     * undos the move if invalid
     * @param movement
     * @param places
     * @param campusMap
     */
    public void checkMove(String movement, Place[] places, CampusMap campusMap){
        if (currentLocation==null) {
            undoMove(movement, places, campusMap);
            System.out.println("This is an invalid move. Returning you back to your previous coordinates.");
        }
          if (currentLocation.equalsIgnoreCase("sage")) {
            if (getCreativity()>5) {
                System.out.println("You have enough creativity points to enter Sage Hall");
            } else {
                System.out.println("You are not allowed to go here yet. Undoing your move");
                undoMove(movement, places, campusMap);
            }
          }
          if (currentLocation.equalsIgnoreCase("scott gym")) {
            if (getFitness()>5) {
                System.out.println("You have enough fitness points to enter Scott Gym");
            } else {
                System.out.println("You are not allowed to go here yet. Undoing your move");
                undoMove(movement, places, campusMap);
            }
          }
          if (currentLocation.equalsIgnoreCase("mcconnell")) {
            if (getLogic()>5) {
                System.out.println("You have enough logic points to enter McConnell");
            } else {
                System.out.println("You are not allowed to go here yet. Undoing your move");
                undoMove(movement, places, campusMap);
            }
          }
    }
}
