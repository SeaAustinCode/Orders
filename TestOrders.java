import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {

        Item item1 = new Item("mocha", 5.50);
        Item item2 = new Item("latte", 3.75);
        Item item3 = new Item("drip coffee", 2.50);
        Item item4 = new Item("cappucino", 3.25);

        Order order1 = new Order("Cindhuri");
        order1.addItem(item1);
        order1.addItem(item2);
        order1.display();

        Order order2 = new Order("Jimmy");
        order2.addItem(item1);
        order2.addItem(item4);
        order2.setReady(true);
        System.out.println(order2.getStatusMessage());
        order2.display();

        Order order3 = new Order("Noah");
        order3.addItem(item2);
        order3.addItem(item2);
        order3.display();

        Order order4 = new Order("Sam");
        order4.addItem(item1);
        order4.addItem(item2);
        order4.display();
        

        Order order5 = new Order();
        order5.addItem(item1);
        order5.addItem(item4);
        order5.addItem(item4);
        order5.display();

        Order order6 = new Order();
        order6.addItem(item4);
        order6.addItem(item1);
        order6.addItem(item1);
        order6.display();
    
    //     // Application Simulations

    //     order2.items.add(item1);
    //     order2.total += item1.price;

    //     order3.items.add(item4);
    //     order3.total += item4.price;

    //     order4.items.add(item2);
    //     order4.items.add(item2);
    //     order4.items.add(item2);
    //     order4.total += item2.price *3;

    //     order1.ready = true;
    //     order2.ready = true;


    //     // Use this example code to test various orders' updates
    //     System.out.printf("Name: %s\n", order1.name);
    //     System.out.printf("Total: %s\n", order1.total);
    //     System.out.printf("Ready: %s\n", order1.ready);
    //     System.out.printf("------------------\n");
    //     System.out.printf("Name: %s\n", order2.name);
    //     System.out.printf("Total: %s\n", order2.total);
    //     System.out.printf("Ready: %s\n", order2.ready);
    //     System.out.printf("------------------\n");
    //     System.out.printf("Name: %s\n", order3.name);
    //     System.out.printf("Total: %s\n", order3.total);
    //     System.out.printf("Ready: %s\n", order3.ready);
    //     System.out.printf("------------------\n");
    //     System.out.printf("Name: %s\n", order4.name);
    //     System.out.printf("Total: %s\n", order4.total);
    //     System.out.printf("Ready: %s\n", order4.ready);
    }
}
