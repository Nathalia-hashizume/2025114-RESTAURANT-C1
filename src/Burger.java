// The word "extends" is key to inherintance in JAVA
// We're saying that the Burger class is a "child" of the FoodItem Class.
public class Burger extends FoodItem {
    
    //This is the constructor of the Burger Class
    //It Hyst takes the weight as an argument.
    public Burger(int weight) {
        //The word "super" calls the constructor of the "parent" class (FoodItem).
        //We're passing the name "Burger" (Which is fixed for this class) and the weight.
        super("Burger", weight);
    }
// The Burger class doesn't need anything else
// It  automatically inherits all properties (name, weight, bestBefore, etc)
// and methos (like toString()) from its parent class, FoodItem.    
}