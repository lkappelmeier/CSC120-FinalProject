/**
 * Represents a person with identity and location
 */
public class Person {
    /**
     * The identity of the person
     */
    public String identity;
    /**The location of the person */
    public Place personLocation;

    /**
     * created person with identity and location
     * @param identity The identity of the person
     * @param personLocation The location of the person
     */
    public Person(String identity, Place personLocation){
        this.identity = identity;
        this.personLocation = personLocation;
    }
    
    /**
     * gets identity of person
     * @return identity of person
     */
    public String getIdentity() {
        return identity;
    }
    /**
     * gets location of the person
     * @return The location of person
     */
    public Place getPersonLocation() {
        return personLocation;
    }
    
        
    
    }
    
