//Class for our storage
public class FoodStorage {
    private FoodItem[] items;
    private final int CAPACITY = 8; // The Capacity is 8
    private int top;
    private int front;
    private int rear;
    private boolean useOppositeSide;
    
    public FoodStorage(boolean useOppositeSide) {
        this.items = new FoodItem[CAPACITY];
        this.useOppositeSide = useOppositeSide;
        this.top = -1;
        this.front = -1;
        this.rear = -1;
    }
    
    public void addItem(FoodItem item) {
        if (useOppositeSide) {
            if (rear == CAPACITY -1) {
                System.out.println("ERROR: Full Storage");
                return;
            }
            if (front ==-1) front = 0;
            items[++rear] = item;
            System.out.println("Add (FIFO):" + item.toString());
        } else {
            if (top == CAPACITY -1) {
                System.out.println("ERROR: Full Storage");
                return;
            }
            items[++top] = item;
            System.out.println("Add (LIFO):" + item.toString());
        }
    }
    
    public void removeItem() {
        if (useOppositeSide){
            if (front ==-1 || front > rear) {
                System.out.println("ERROR: Empty Storage");
                return;
            }
            FoodItem removed = items[front++];
            System.out.println("REMOVED (FIFO): " + removed.toString());
        } else {
            if (top ==-1){
                System.out.println("ERROR: Empty Storage");
                return;
            }
            FoodItem removed = items[top--];
            System.out.println("REMOVED (LIFO): " + removed.toString());
        }
    }
    
    public void displayItems() {
        System.out.println("--- items in storage ---");
        if (useOppositeSide) {
            if (front ==-1 || front > rear) {
                System.out.println("Empty");
                return;
            }
            for (int i = front; i <= rear; i++) {
                System.out.println(items[i].toString());
            }
        } else {
            if (top ==-1) {
                System.out.println("Empty");
                return;
            }
            for (int i =0; i<= top; i++) {
                System.out.println(items [i].toString());
            }
        }
        System.out.println("-------------------------");
    }
    //I added the remaining classes to the food types
    public FoodItem peek() {
        if (useOppositeSide) {
            if (front == -1 || front > rear) {
                System.out.println("Warning: Empty Storage");
                return null; // Back Null if is Empty
            } 
            return items [front];
        } else {
            if (top ==-1) {
                System.out.println("Warning: Empty Storage");
                return null;
            }
            return items[top--];
        }
    }
}
