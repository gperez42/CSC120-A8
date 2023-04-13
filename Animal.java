
// import org.junit.Assert.*; 
import java.util.ArrayList;

public class Animal //implements Contract 
{
    /** Attribute - ArrayList that stores all born animals */
    public ArrayList<String> allAnimals;
    /** Attribute - type of species animal belongs to */
    public String species;
    /** Attribute - age of animal */
    public int age;
    /** Attribute - whether or not the animal can walk */
    public boolean abilityToWalk;
    /** Attribute - whether or not the animal can fly */
    public boolean abilityToFly;
    /** Attribute - item that the animal grabs/drops/examines/uses */
    public String item;
    /** Attribute - whether or not the animal is holding an item */
    public boolean hasItem;
    /** Attribute - direction in which animal is walking if able to walk */
    public String direction;
    /** Attribute - movement on imaginary x-axis, or whether animal is flying left or right if able to fly */
    public int x;
    /** Attribute - movement on imaginary y-axis, or whether animal is flying up or down if able to fly */
    public int y;
    /** Attribute - number of sizes an item is shrunk or grown by the magical animal */
    public Number number;

    /** Constructor for Animal
     * @param species - species of animal
     * @param age - age of animal
     * @param abilityToWalk - whether or not the animal can walk, true or false
     * @param abilityToFly - whether or not the animal can fly, true or false
     * @param hasItem - whether or not the animal has an object, true or false
     * @param item - the item potentially held by the animal
     * @param x - x coordinate of animal when flying
     * @param y - y coordinate of animal when flying
     * @param number - number of sizes item has been shrunk or grown
    */
    public Animal(String species, int age, boolean abilityToWalk, boolean abilityToFly, boolean hasItem, String item, int x, int y,  Number number) {
        this.allAnimals = new ArrayList<String>();
        this.species = species;
        this.age = age;
        this.abilityToWalk = abilityToWalk;
        this.abilityToFly = abilityToFly;
        this.hasItem = hasItem;
        this.item = item;
        this.x = x;
        this.y = y;
        this.number = number;
        System.out.println("A new animal has just been born!");
    }
    /** Overloaded Animal Constructor - for animals that can't fly and therefore don't need x and y coordinates 
     *  @param species - species of animal
     * @param age - age of animal
     * @param abilityToWalk - whether or not the animal can walk, true or false
     * @param abilityToFly - whether or not the animal can fly, true or false
     * @param hasItem - whether or not the animal has an object, true or false
     * @param item - the item potentially held by the animal
     * @param number - number of sizes item has been shrunk or grown
    */
    public Animal(String species, int age, boolean abilityToWalk, boolean abilityToFly, boolean hasItem, String item, Number number) {
        this.allAnimals = new ArrayList<String>();
        this.species = species;
        this.age = age;
        this.abilityToWalk = abilityToWalk;
        this.abilityToFly = abilityToFly;
        this.hasItem = hasItem;
        this.item = item;
        this.number = number;
        System.out.println("A new animal has just been born!");
    }

    // /* Accessor/getter for number of animals */
    // public int nAnimals() {
    //     return this.allAnimals.size();
    // }

    // /* Accessor/getter for all of the animals in the magical zoo */
    // public String allAnimals() {
    //     return this.allAnimals();
    // }

    //  /** Additional method - Adds a new species of animal to the list of all animals in the magical zoo
    // * @param species - species added
    // */
    // public void transfer(String species) {
    //     this.allAnimals.add(species);
    //     System.out.println("Wow, a new transfer animal has arrived to the magical zoo! It is a " + this.species + ".");
    // }
   
    /** Allows the animal to grab an item
     * @param item - item animal is grabbing
     */
    public void grab(String item) {
        System.out.println("The " + this.species + " has just grabbed the " + this.item + ".");
    }

    /** Allows the animal to drop an item
     * @param item - item animal is dropping
     */
    public String drop(String item) {
            System.out.println("This " + this.species + " has dropped the " + this.item + ".");
            return item;

    }
     /** Allows the animal to examine an item
     * @param item - item animal is examining
     */
    public void examine(String item) {
        System.out.println("The " + this.species + " has is looking at the " + this.item + ".");

    }
     /** Allows the animal to use an item
     * @param item - item animal is using
     */
    public void use(String item) {
        System.out.println("The " + this.species + " is currently using the " + this.item + ".");
    }

    // @BeforeWalk (expected = RuntimeException.class)

     /** Allows the animal to walk in a certain direction if able to walk
     * @param direction - direction in which animal is walking
     * @return boolean - true if animal can walk, false if not
     */
    public boolean walk(String direction) {
        if (this.abilityToWalk == true) {
            this.direction = direction;
            System.out.println("The " + this.species + " is currently walking to the " + this.direction + ".");
            return this.abilityToWalk;
            
        }
        else {
            throw new RuntimeException("Sorry, the animal species of " + this.species + " does not have the ability to walk.");
            // return false;
        }
    }

    /** Allows the animal to fly in a certain direction if able to fly
     * @param x - direction in which animal is flying horizontally (coordinates that represent left or right)
     * @param y - direction in which animal is flying vertically (coordinates that represent up or down)
     * @return boolean - true if animal can fly, false if not
     */
    public boolean fly(int x, int y) {
        if (this.abilityToFly == true) {
            System.out.println("The " + this.species + " is currently flying in a way that will cause it to end up " + this.x + " inches horizontally and " + this.y + " inches vertically away from its initial starting point.");
            return this.abilityToFly;
        }
        else {
            throw new RuntimeException("Sorry, the animal species of " + this.species + " does not have the ability to fly.");
            // return false;
        }
    
    }

    /** Allows the magical animal to shrink an item
     * @return Number - number of sizes an item is shrunk
     */
    public Number shrink() {
        System.out.println("OMG, it turns out that the " + this.species + " has magical abilites!");
        System.out.println("But oh no!");
        System.out.println("The " + this.species + " has just shrunk the " + this.item + " by " + this.number + " times its size.");
        return number; 
    }

    /** Allows the magical animal to cause an item to grow
     * @return Number - number of sizes an item's size is increased by
     */
    public Number grow() {
        System.out.println("The " + this.species + " has just magically caused the " + this.item + " to grow " + this.number + " times its size.");
        return number;
    }

    /** Allows the animal to sleep/rest */
    public void rest() {
        System.out.println("The " + this.species + " is tired. " + "It needs to go to sleep now, zzzzzz....");
    }

    /** Removes an animal from the magical zoo */
    public void undo() {
        this.allAnimals.remove(this.species);
        System.out.println("You've just caused your magical animal, the " + this.species + ", to disappear from your magical zoo...");
    }

    // /** Additional method - to print out list of all animals born */
    // public void print() {
    //     for (String animal : this.allAnimals) {
    //         System.out.println(animal);
    //     }
    
    // }

    // for (int i=0; i<this.allAnimals.size(); i++) {
    //     int animal = this.allAnimals.get(i);
    //     System.out.println(animal);
    // }
    // }

    /**
     * Tests methods created for the Animal class
     * @param args - the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("You are the owner of a magial zoo, and you have the power to cause new animals to be born!");
        Animal dog = new Animal("dog", 7, true, false, true, "shoe", 3);
        dog.walk("left");
        // dog.fly(3, 4);
        Animal dolphin = new Animal("dolphin", 1, false, false, true, "toy", 4);
        dolphin.grab(dolphin.item);
        dolphin.shrink();
        // System.out.println(dog.item);
        Animal parakeet = new Animal("parakeet", 1, true, true, true, "piece of wood", 2);
        parakeet.fly(3, 4);
        parakeet.grow();
        dog.rest();
        parakeet.undo();
        dog.undo();

        // dog.transfer("husky"); 
        // System.out.println(dog.allAnimals());
    }


}


   
