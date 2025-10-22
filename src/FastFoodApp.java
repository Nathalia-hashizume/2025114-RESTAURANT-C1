import java.util.Scanner;

public class FastFoodApp {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // First Question to define storage mode
        System.out.println("Welcome to the storage system!");
        System.out.println("Choose the operating mode:");
        System.out.println("1 - Front Door Only (LIFO - Stack)");
        System.out.println("2 - Front and back door (FIFO - Queue)");
        System.out.println("Select the number of your choice");
        int modeChoice = scanner.nextInt();
        boolean useFifoMode = (modeChoice == 2);
        
        //Creates the storage object with the mode chosen by the user
        FoodStorage storage = new FoodStorage(useFifoMode);
        System.out.println("Storage configured for mode" + (useFifoMode ? "FIFO(Queue)." : "LIFO (Stack)."));
        
        //Loop for MENU
        while (true) {
            System.out.println("MAIN MENU");
            System.out.println("1 - Add Item");
            System.out.println("2 - Remove Item");
            System.out.println("3 - View Item at Top (Peek) ");
            System.out.println("4 - Show All Items");
            System.out.println("5 - Exit");
            System.out.println("Enter your choice:");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); //Consumes the newline left by nextInt()
            
            switch (choice) {
                case 1:
                    System.out.println("Which item do you want to add?");
                    System.out.println("1 - Burger | 2 - Pizza | 3 - Fries | 4 - Sandwich | 5 - Hotdog");
                    System.out.println("Enter your choice:");
                    int foodChoice = scanner.nextInt();
                    System.out.println("Enter the weight in grams:");
                    int weight = scanner.nextInt();
                    
                    FoodItem newItem = null;
                    switch (foodChoice) {
                        case 1:
                            newItem = new Burger(weight);
                            break;
                        case 2:
                            newItem = new Pizza(weight);
                            break;
                        case 3:
                            newItem = new Fries(weight);
                            break;
                        case 4:
                            newItem = new Sandwich(weight);
                            break;
                        case 5: 
                            newItem = new Hotdog(weight);
                            break;
                        default:
                            System.out.println("Invalid Food Option");
                            break;
                    }
                    
                    if (newItem != null) {
                        storage.addItem(newItem);
                    }
                    break;
                    
                case 2:
                    storage.removeItem();
                    break;
                    
                case 3:
                    FoodItem topItem = storage.peek();
                    if (topItem != null) {
                        System.out.println("Top Item:" + topItem.toString());
                    }
                    break;
                case 4:
                    storage.displayItems();
                    break;
                    
                case 5:
                    System.out.println("Leaving the program. See you soon!");
                    scanner.close(); //Close scanner before leave
                    return; //End application
                    
                default:
                    System.out.println("Invalid selection. Please try again.");
                    break;
            }
        }
    }
}