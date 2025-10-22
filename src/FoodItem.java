import java.time.LocalDate;
import java.time.LocalDateTime;

public class FoodItem {
    private String name;
    private int weight; // grams
    private LocalDate bestBefore;
    private LocalDateTime placedTime;
    
    public FoodItem(String name, int weight) {
        this.name = name;
        this.weight = weight;
        this.bestBefore = LocalDate.now().plusWeeks(2);
        this.placedTime = LocalDateTime.now();
}
    
@Override
public String toString() {
    //Show more details
    return "FoodItem{name=' " + name + "', weight=" + weight + "g, bestBefore=" + bestBefore + ",placedTime=" + placedTime + "}";
}
}