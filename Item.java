import java.util.ArrayList;
public class Item {
    public String itemName;
    public String use;
    public int chestCount;
    /** list of potential items */
    public ArrayList<Item> listOfItems;
    //public Player player;
    /**
     * 
     * @param itemName name of Item
     * @param use use of Item
     */
    public Item(String itemName, String use){
        this.itemName = itemName;
        this.use = use;
        this.chestCount = 0;
    }

    
    /**
     * 
     * @return the name of the item
     */
    public String getItemName() {
        return itemName;
    }
    /**
     * 
     * @return the use of the item
     */
    public String getUse() {
        return use;
    }
    /**
     * adds item to list of items and prints the confirmation
     * @param listOfItems to add the item to
     * @param item the item being added
     */
    public void addItem(ArrayList<Item> listOfItems, Item item){
        System.out.println("You have added a " + item.getItemName() + "!");
        listOfItems.add(item);
    
    }
    /**
     * removes item from list of items and prints confirmation
     * @param listOfItems the item is being removed from
     * @param item the item being removed
     */
    public void removeItem(ArrayList<Item> listOfItems, Item item){
        System.out.println("You have removed the " + item.getItemName());
        listOfItems.remove(item);
    }
    /**
     * 
     * @param inputString  typed String of item
     * @return if typed string matches the name of item, returns that item
     */
    public String findItem(String inputString){
            if (inputString.contains(getItemName())) {
                String foundItem = getItemName();
                return foundItem;
            }
            return null;
    }
    
    /**
     * finds the use of the item being used and prints confirmation as well as new points after properly adjusting
     * @param player that the points are being given to
     */
    public void useItem(Player player){
        if (getUse()=="fitness") {
            System.out.println("You threw the " + getItemName() + "!");
            int t = player.getFitness();
            t++;
            player.setFitness(t);
            System.out.println("You now have " + player.getFitness() + " fitness points!");
        }
        if (getUse()=="creativity") {
            System.out.println("You used or played the " + getItemName());
            int t = player.getCreativity();
            t++;
            player.setCreativity(t);
            System.out.println("You now have " + player.getCreativity() + " creativity points!");
        }
        if (getUse()=="logic") {
            System.out.println("You used or read the " + getItemName());
            int t = player.getLogic();
            t++;
            player.setLogic(t);
            System.out.println("You now have " + player.getLogic() + " logic points");
        }
        if (getUse()=="charisma") {
            System.out.println("You have used or read the " + getItemName());
            int t = player.getCharisma();
            t++;
            player.setCharisma(t);
            System.out.println("You now have " + player.getCharisma() + " charisma points");
            
        }
    }
    /**
     * prints item name
     */
    public void printItemName(){
        System.out.println(getItemName());
    }

   



}
