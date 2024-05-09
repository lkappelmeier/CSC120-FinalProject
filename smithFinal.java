//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class smithFinal {

    public void helpFunction(){
        System.out.println("Welcome to The Smith Scavenger Game!" );
        System.out.println("------------------------------------------------");
        System.out.println("You can look for chests of items and people to interact with to help you on your journey.");
        System.out.println("Don't fall in the pond, and make sure to check on your skill points!");
        System.out.println("You can use commands such as:");
        System.out.println("move (direction)");
        System.out.println("open chest");
        System.out.println("use (object)");
        System.out.println("interact");
        System.out.println("drop (item)");
    }
    public static void main(String[] args) {
        smithFinal smithFinal = new smithFinal();
        smithFinal.helpFunction();
        Boolean gameActive = true;
        double probability = 0.2;
        Random rand = new Random(); // Create a Random object
          //Add Locations
        Place [] places = {
        new Place("Campus Center", 7, 12,   rand.nextDouble() < probability), 
        new Place("Helen Hills Hills Chapel", 4, 11,  rand.nextDouble() < probability), 
        new Place("Davis Center", 4, 14,  rand.nextDouble() < probability), 
        new Place("Ainsworth Gym", 14, 7,  rand.nextDouble() < probability), 
        new Place("John M. Greene", 7, 13,  rand.nextDouble() < probability), 
        new Place("Dewey", 8, 13,  rand.nextDouble() < probability), 
        new Place("Clark", 8, 14,  rand.nextDouble() < probability), 
        new Place("Unity", 7, 16,  rand.nextDouble() < probability), 
        new Place("Burton Lawn", 9, 11,  rand.nextDouble() < probability),             
        new Place("President's House", 4, 8,  rand.nextDouble() < probability), 
        new Place("Friedman Complex", 4, 12,  rand.nextDouble() < probability), 
        new Place("Admission's", 5, 9,  rand.nextDouble() < probability), 
        new Place("Wilson", 1, 6,  rand.nextDouble() < probability), 
        new Place("King", 1, 7,  rand.nextDouble() < probability), 
        new Place("Morrow", 2, 5,  rand.nextDouble() < probability), 
        new Place("Gardiner", 2, 7,  rand.nextDouble() < probability), 
        new Place("Scales", 2, 8,  rand.nextDouble() < probability), 
        new Place("Haynes", 3, 5,  rand.nextDouble() < probability), 
        new Place("Cushing", 3, 6,  rand.nextDouble() < probability), 
        new Place("Quad", 2, 6,  rand.nextDouble() < probability), 
        new Place("Jordan", 3, 7,  rand.nextDouble() < probability), 
        new Place("Road", 3, 8,  rand.nextDouble() < probability), 
        new Place("Tenney & Friends", 3, 9,  rand.nextDouble() < probability),  
        new Place("Parsons annex", 3, 11,  rand.nextDouble() < probability), 
        new Place ("Parsons", 3, 12,  rand.nextDouble() < probability), 
        new Place("Capen Annex", 3, 14,  rand.nextDouble() < probability), 
        new Place("Friedmans", 4, 4,  rand.nextDouble() < probability), 
        new Place("Comstock", 4, 5,  rand.nextDouble() < probability), 
        new Place("Emerson", 4, 6,  rand.nextDouble() < probability), 
        new Place("Path", 4, 9,  rand.nextDouble() < probability), 
        new Place("Park", 4, 10,  rand.nextDouble() < probability), 
        new Place("Parking Lot", 4, 13,  rand.nextDouble() < probability), 
        new Place("Capen Garden", 4, 14,  rand.nextDouble() < probability), 
        new Place("Road", 5, 10,  rand.nextDouble() < probability),  
        new Place("Park Annex", 5, 11,  rand.nextDouble() < probability), 
        new Place("Sessions", 5, 12,  rand.nextDouble() < probability), 
        new Place("Ziskind", 5, 13,  rand.nextDouble() < probability), 
        new Place("Cutter", 5, 14,  rand.nextDouble() < probability), 
        new Place("Grass", 5, 15,  rand.nextDouble() < probability), 
        new Place("Capen", 5, 16,  rand.nextDouble() < probability), 
        new Place("Parking Lot", 6, 10,  rand.nextDouble() < probability), 
        new Place("Haven/Wesley/Hopkins", 6, 11,  rand.nextDouble() < probability), 
        new Place("Campus Center Cafe", 6, 12,  rand.nextDouble() < probability), 
        new Place("Road", 6, 13,  rand.nextDouble() < probability), 
        new Place("Road", 6, 14,  rand.nextDouble() < probability), 
        new Place("Lamont", 6, 15,  rand.nextDouble() < probability), 
        new Place("Talbot", 6, 16,  rand.nextDouble() < probability), 
        new Place("Boat House", 7, 9,  rand.nextDouble() < probability), 
        new Place("Lyman Conservatory", 7, 10,  rand.nextDouble() < probability), 
        new Place("Chapin", 7, 11,  rand.nextDouble() < probability), 
        new Place("PVTA", 7, 14,  rand.nextDouble() < probability), 
        new Place("Northrop-Gillet", 7, 15,  rand.nextDouble() < probability), 
        new Place("Hungry Ghost Bread", 7, 17,  rand.nextDouble() < probability), 
        new Place("Crew House", 8, 9,  rand.nextDouble() < probability),  
        new Place("Path", 8, 10,  rand.nextDouble() < probability), 
        new Place("Wright", 8, 11,  rand.nextDouble() < probability),  
        new Place("Chapin Lawn", 8, 12,  rand.nextDouble() < probability), 
        new Place("Chase-Duckett", 8, 15,  rand.nextDouble() < probability), 
        new Place("Albright", 8, 16,  rand.nextDouble() < probability),  
        new Place("Baldwin", 8, 17,  rand.nextDouble() < probability), 
        new Place("Pond", 9, 8,  rand.nextDouble() < probability), 
        new Place("Sabin-Reed", 9, 9,  rand.nextDouble() < probability), 
        new Place("Burton", 9, 10,  rand.nextDouble() < probability), 
        new Place("Compass Cafe", 9, 12,  rand.nextDouble() < probability), 
        new Place("Path", 9, 13,  rand.nextDouble() < probability),  
        new Place("Museum of Art", 9, 14,  rand.nextDouble() < probability), 
        new Place("Road", 9, 15,  rand.nextDouble() < probability), 
        new Place("Alumnae House", 9, 16,  rand.nextDouble() < probability), 
        new Place("Pond", 10, 8,  rand.nextDouble() < probability), 
        new Place("Path", 10, 9,  rand.nextDouble() < probability), 
        new Place("Tyler", 11,9,  rand.nextDouble() < probability), 
        new Place("Young Library", 11, 11,  rand.nextDouble() < probability), 
        new Place("Alumnae Gym", 11, 12 ,  rand.nextDouble() < probability), 
        new Place("Washburn", 11, 13,  rand.nextDouble() < probability), 
        new Place("Seelye", 11, 14,  rand.nextDouble() < probability), 
        new Place("Pierce", 11, 15,  rand.nextDouble() < probability), 
        new Place("College Hall", 11, 16,  rand.nextDouble() < probability), 
        new Place("Field", 12, 6,  rand.nextDouble() < probability), 
        new Place("Bridge", 12, 7,  rand.nextDouble() < probability), 
        new Place("Sweeney", 12, 8,  rand.nextDouble() < probability), 
        new Place("Path", 12, 9,  rand.nextDouble() < probability), 
        new Place("Morris", 12, 10,  rand.nextDouble() < probability), 
        new Place("Lawrence", 12, 11,  rand.nextDouble() < probability), 
        new Place("Parking Lot", 12, 12,  rand.nextDouble() < probability), 
        new Place("Hubbard", 12, 13,  rand.nextDouble() < probability), 
        new Place("Lilly", 12, 14,  rand.nextDouble() < probability), 
        new Place("Parking Lot", 13, 7,  rand.nextDouble() < probability), 
        new Place("Sage", 13, 8,  rand.nextDouble() < probability), 
        new Place("Mendenhall", 13, 9,  rand.nextDouble() < probability), 
        new Place("Mendenhall", 13, 10,  rand.nextDouble() < probability), 
        new Place("Ford", 13, 11,  rand.nextDouble() < probability), 
        new Place("Parking Lot", 13, 12,  rand.nextDouble() < probability), 
        new Place("Ainsworth Gym", 14, 7,  rand.nextDouble() < probability), 
        new Place("Scott Gym", 14, 8,  rand.nextDouble() < probability), 
        new Place("Josten", 14, 9,  rand.nextDouble() < probability), 
        new Place("Schacht Center", 14, 10,  rand.nextDouble() < probability), 
        new Place("Ford", 14, 11,  rand.nextDouble() < probability), 
        new Place("Pond", 10, 8,  rand.nextDouble() < probability),  
        new Place("Conference Center", 10, 9,  rand.nextDouble() < probability), 
        new Place("McConnell", 10, 10,  rand.nextDouble() < probability), 
        new Place("Bass", 10, 11,  rand.nextDouble() < probability), 
        new Place("Neilson", 10, 12,  rand.nextDouble() < probability), 
        new Place("Neilson Lawn", 10, 13,  rand.nextDouble() < probability), 
        new Place("Hillyer", 10, 14,  rand.nextDouble() < probability), 
        new Place("Road", 10, 15,  rand.nextDouble() < probability), 
        new Place("Stoddard", 10, 16,  rand.nextDouble() < probability), 
    };
        //Campus Map
        CampusMap campusMap = new CampusMap(places);
        //Player
        Player mainPlayer = new Player();
       
        //Inventory & Chest
        ArrayList<Item> inventory = new ArrayList<>();
        ArrayList<Item> chest = new ArrayList<>();
        //Create Items
        Item basketball = new Item("basketball", "fitness");
        Item money = new Item("random book", "charisma");
        Item shoes = new Item("shoes", "clothing");
        Item hat = new Item("hat", "clothing");
        Item DVD = new Item("dvd", "entertainment");
        Item mathBook = new Item("math book", "logic");
        Item chessBoard = new Item("chess board", "logic");
        Item SWAGBook = new Item("swag textbook", "charisma");
        Item sabcarpCD = new Item("sabrina carpenter album", "creativity");
        Item paintbrushes = new Item("paintbrushes", "creativity"); 
        Item baseball = new Item("baseball", "fitness");
        Item violin = new Item("violin", "creativity");
        Item flute = new Item("flute", "creativity");
        Item sketchbook = new Item("sketchbook", "creativity");
        Item physicsBook = new Item("physics book", "logic");
        Item celsius = new Item("celsius energy drink", "energy");
        Item chickenTenders = new Item("chicken tenders", "food");
        Item frisbee = new Item("frisbee", "fitness");
        Item poetryBook = new Item("poetry book", "charisma");
        Item checkersBoard = new Item("checker's board", "logic");
        Item nyt = new Item("nyt games subscription", "logic");
        Item saxophone = new Item("saxophone", "creativity");
        Item iPad = new Item("ipad", "entertainment");
        Item slime = new Item("slime", "entertainment");
        Item guitar = new Item("guitar", "creativity");
        Item soccerball = new Item("soccer ball", "fitness");
        Item hydroflask = new Item("hydroflask", "food");
        Item boxOfCrackers = new Item("crackers", "food");
        Item someonesOneCard = new Item("stranger's one card", "nothing");
        Item nyc = new Item("nyc postcard", "creativity");
        Item bassoon = new Item("bassoon", "creativity");
        Item iPod = new Item("ipod", "entertainment");
        Item popit = new Item("popit", "entertainment");
        Item viola = new Item("viola", "creativity");
        Item fieldhockeystick = new Item("field hockey stick", "fitness");
        Item checkers = new Item("checkers game", "logic");
        Item piccolo = new Item("piccolo", "creativity");
        Item computer = new Item("computer", "entertainment");
        Item beanbag = new Item("beanbag", "who even knows");
        Item ringlight = new Item("ring light", "charisma");
        Item squashracket = new Item("squash racket", "fitness");

        //Add Items
        chest.add(basketball);
        chest.add(money);
        chest.add(shoes);
        chest.add(hat);
        chest.add(DVD);
        chest.add(mathBook);
        chest.add(chessBoard);
        chest.add(SWAGBook);
        chest.add(sabcarpCD);
        chest.add(paintbrushes);
        chest.add(baseball);
        chest.add(violin);
        chest.add(flute);
        chest.add(sketchbook);
        chest.add(physicsBook);
        chest.add(celsius);
        chest.add(chickenTenders);
        chest.add(frisbee);
        chest.add(poetryBook);
        chest.add(checkersBoard);
        chest.add(nyt);
        chest.add(saxophone);
        chest.add(soccerball);
        chest.add(iPad);
        chest.add(slime);
        chest.add(guitar);
        chest.add(hydroflask);
        chest.add(boxOfCrackers);
        chest.add(checkers);
        chest.add(computer);
        chest.add(ringlight);
        chest.add(squashracket);
        chest.add(bassoon);
        chest.add(someonesOneCard);
        chest.add(nyc);
        chest.add(iPod);
        chest.add(popit);
        chest.add(viola);
        chest.add(piccolo);
        chest.add(fieldhockeystick);
        chest.add(beanbag);
        

        Random randP = new Random();

        //People
        Person [] persons = {
            new Person("athelete", places[randP.nextInt(90)]),
            new Person("musician", places[randP.nextInt(90)]),
            new Person(null, places[randP.nextInt(90)]),
            new Person("stem major", places[randP.nextInt(90)]),
            new Person("humanities major", places[randP.nextInt(90)]),
            new Person("administrator", places[randP.nextInt(90)]),
            new Person("athelete", places[randP.nextInt(90)]),
            new Person("musician", places[randP.nextInt(90)]),
            new Person(null, places[randP.nextInt(90)]),
            new Person("stem major", places[randP.nextInt(90)]),
            new Person("humanities major", places[randP.nextInt(90)]),
            new Person("administrator", places[randP.nextInt(90)])
        };
        //Interaction
        Interact interaction = new Interact();
        while (gameActive) {
            // Be continuously updating location
            int x = mainPlayer.getxPlayer();
            int y = mainPlayer.getyPlayer();
            String currentStringLocation = campusMap.getStringPlaceFromCoordinates(x, y, places);
            Place currentPlaceLocation = campusMap.getPlaceFromCoordinates(x, y, places);

            
            //Initalize Scanner
            Scanner sc = new Scanner(System.in);
            String userInput = sc.nextLine().toLowerCase();
            //Game Loop
            if (userInput.contains("quit")) {
                System.out.println("Thanks for playing!");
                mainPlayer.printAllPoints();
                sc.close();
                gameActive = false;
            }
    
            if (campusMap.getStringPlaceFromCoordinates(x, y, places)=="PVTA") {
                System.out.println("You have made it to the B43! You Win!");
                mainPlayer.printAllPoints();
                sc.close();
                gameActive = false;
            } 
            if (mainPlayer.checkForWin(places, campusMap)) {
                sc.close();
                gameActive = false;
            }
            //Getting Help 
            if (userInput.contains("help")) {
                smithFinal.helpFunction();
            }
            //Getting Locations
            if (userInput.contains("coordinates")) {
                System.out.println("You are located at X: " + x + " Y: " + y);
            }

            if (userInput.contains("where am i")) {
                if (currentStringLocation!=null) {
                    System.out.println("You are at " + currentStringLocation);
                } else {
                    System.out.println("Uh we cannot seem to find your location. You probably got lost. I would quit and restart the game.");
                }
            }
            //Movement Revised
            if (userInput.contains("move")) {
                String movement = userInput;
                mainPlayer.move(movement, places, campusMap);
                mainPlayer.checkMove(movement, places, campusMap);
                mainPlayer.getCurrentLocationPlace(campusMap, mainPlayer.getxPlayer(), mainPlayer.getyPlayer(), places).lookForChest(mainPlayer, campusMap, places);
                mainPlayer.getCurrentLocationPlace(campusMap, mainPlayer.getxPlayer(), mainPlayer.getyPlayer(), places).lookForPeople(mainPlayer, campusMap, persons, places);
                mainPlayer.checkForWin(places, campusMap);
            }
            
            // Open Chest
            if (userInput.contains("open chest")) {
                System.out.println("Opening Chest...");
                if (currentPlaceLocation.getContainsChest()) {
                    for (int index = 0; index < 2; index++) {
                        int chestSize = chest.size();
                        int randomIndex = rand.nextInt(chestSize);
                        Item chosenItem = chest.get(randomIndex);
                        inventory.add(chosenItem);
                        chest.remove(chosenItem);
                        System.out.println("This chest has a " + chosenItem.getItemName());
                    }
                    currentPlaceLocation.setContainsChest(false);
                    System.out.println("These items have been automatically added to your inventory.");
                } else {
                    System.out.println("You cannot open a chest because there is none here or you have already emptied it!");
                }
            }
        
            if (userInput.contains("drop")) {
                String itemString = userInput.substring(3);
                if (!inventory.isEmpty()) {
                    boolean itemFound = false;
                    for (int index = 0; index < inventory.size(); index++) {
                        String hereYouGo = inventory.get(index).findItem(itemString);
                        if (hereYouGo != null) {
                            Item hereYouGoItem = inventory.get(index);
                            System.out.println("You just dropped " + hereYouGo);
                            inventory.remove(hereYouGoItem);
                            itemFound = true;
                            break;
                        }
                    }
                    if (!itemFound) {
                        System.out.println("I don't know what item you are talking about!");
                    }
                } else {
                    System.out.println("Your inventory is empty!");
                }
                mainPlayer.checkForWin(places, campusMap);
                
            }
        
            if (userInput.contains("interact")) {
                //had chat GPT help me find a way to cycle through each of the npcs
                for (Person person : persons) {
                    if (person.getPersonLocation()==mainPlayer.getCurrentLocationPlace(campusMap, x, y, places)) {
                        interaction.interactWithPerson(mainPlayer, person);
                        break;
                    } 
                }  
                mainPlayer.checkForWin(places, campusMap);
            
            }      
            if (userInput.contains("use")) {
                String itemString = userInput.substring(3);
                if (!inventory.isEmpty()) {
                    boolean itemFound = false;
                    for (int index = 0; index < inventory.size(); index++) {
                        String hereYouGo = inventory.get(index).findItem(itemString);
                        if (hereYouGo != null) {
                            Item hereYouGoItem = inventory.get(index);
                            System.out.println("You just used " + hereYouGo);
                            hereYouGoItem.useItem(mainPlayer);
                            itemFound = true;
                            break;
                        }
                    }
                    if (!itemFound) {
                        System.out.println("I don't know what item you are talking about!");
                    }
                } else {
                    System.out.println("Your inventory is empty!");
                }
                mainPlayer.checkForWin(places, campusMap);
                
            }


            if (userInput.contains("inventory")) {
                if (!inventory.isEmpty()) {
                    for (Item index : inventory) {
                        index.printItemName();
                    }
                } else {
                    System.out.println("Uhhh... there is nothing in your inventory");
                }
                
            }
            if (userInput.contains("points")) {
                mainPlayer.printAllPoints();
            }

        }
        }    }