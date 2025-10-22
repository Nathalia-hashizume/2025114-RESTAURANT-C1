Public interface IStorage {
    
    //Any class that "signs" this contract must have an addItem method
void addItem(FoodItem item);

//method removeItem
void removeItem();

//method peek
FoodItem peek();

//Method displayItems
void displayItems();
}