import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

// Class to represent a food item

class FoodItem {
    private String name;
    private int weight; //grams
    private LocalDate bestBefore;
    private LocalDateTime placedTime;
    
    public FoodItem(String name, int weight){
        this.name = name;
        this.weight = weight;
        this.bestBefore = LocalDate.now().plusWeeks(2);
        this.placedTime = LocalDateTime.now();
    }
    @Override
    public String toString() {
        return "FoodItem{name='" + name + "', weight=" + weight + "g, bestBefore=" + bestBefore + "}";
    }
    }

