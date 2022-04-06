import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items = new ArrayList<Item>(); // defaults to null
    
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order() {
        this.name = "Guest";
    }
    
    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name) {
        this.name = name;
    }
    // ORDER METHODS
    public void addItem(Item item) {
        this.items.add(item);
    }

    public String getStatusMessage() {
        if (ready = true) {
            return "Your order is ready!";
        }
        else { 
            return "Thank you for waiting, your order will be ready soon.";
        }
    }

    public double getOrderTotal(){
        double ordertotal = 0.0;
        for (Item orderitem : this.getItems()){
            ordertotal += orderitem.getPrice();
        }
        return ordertotal;
    }

    public void display() {
        System.out.println("Customer Name: " + this.getName());
        for(Item orderitem : this.getItems()) {
            System.out.println(orderitem.getName() + " " + orderitem.getPrice());
        }
        System.out.println("Total: " + this.getOrderTotal());
    }
    
    // GETTERS & SETTERS
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public boolean getReady() {
        return this.ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}

