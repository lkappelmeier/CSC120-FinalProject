public class Interact {
    /**
     * person Person
     */
    public Person person;
    
    /**
     * finds identity of person the player is interacting with, prints relevant message, and adjusts points accordingly
     * @param player
     * @param person
     */
    public void interactWithPerson(Player player, Person person){
        int ch = player.getCharisma();
        int cr = player.getCreativity();
        int fi = player.getFitness();
        int lo = player.getLogic();
            ch++;
        player.setCharisma(ch);
        if (person.getIdentity()=="athlete") {
            fi++;
            player.setFitness(fi);
            System.out.println("You have interacted with an athlete! Here is another fitness point!");
        } 
        if (person.getIdentity()=="musician") {
            cr++;
            player.setCreativity(cr);
            System.out.println("Wow! You how found a musician! Here is another creativity point!");
        } 
        if (person.getIdentity()==null) {
            System.out.println("Ummmm... Weird. This person has no idenitity... probably a first year.");
        }
        if (person.getIdentity()=="stem major") {
            lo++;
            player.setLogic(lo);
            System.out.println("You have found a stem major! Here is another logic point!");
        }
        if (person.getIdentity()=="humanities major") {
            ch++;
            player.setCharisma(ch);
            System.out.println("You have found a humanities major! Here is ANOTHER charisma point!");
        }
        if (person.getIdentity()=="administrator") {
            System.out.println("You have found an administrator! They probably don't know you or care about you, so you remain unaffected!");
        }
        }
        

 

    }

    