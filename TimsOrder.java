package Assignment7_000791775;

import java.util.Arrays;
import java.util.Scanner;

/**
 * implements the TimsOrder class diagram which has a 1 to many association with the TimsProduct class
 * author: Ohia William
 */
public class TimsOrder {

    private static int size;
    private static String name;
    private TimsProduct[] myOrder;
    private static Muffin m;
    private static Donut d;
    private static WaterBottles w;
    private static String message = "";
    private static double total;


    /**
     *
     * @param name of the customer
     * @param size of the order
     */
    private TimsOrder(String name, int size) {
        this.size = size;
        this.name = name;

    }

    /**
     *
     * @return the Tims order that will be created
     */
    public static TimsOrder create(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("How many items did you get?: ");
        int item;
        item = sc.nextInt();
        TimsProduct[] myOrder = new TimsProduct[item];
        TimsOrder order = new TimsOrder(name, item);
        for(int i = 0; i < myOrder.length; i++){
            System.out.println("Pick your choice of item; 1 = Water Bottle, 2 = Muffin, 3 = Donut");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    m = Muffin.create();
                    message += m + "\n";
                    total += m.getRetailPrice();
                    break;
                case 2:
                    d = Donut.create();
                    message += d + "\n";
                    total += d.getRetailPrice();
                    break;
                case 3:
                    w = WaterBottles.create();
                    message += w + "\n";
                    total += d.getRetailPrice();
                    break;
                default:
                    System.out.println("Invalid choice");
                    i--;
                    break;
            }
        }

        return order;
    }

    /**
     *
     * @return the total amount of all items
     */
    public double getAmountDue() {
        return total;
    }

    @Override
    public String toString() {
        message += name + " Order of " + size + "\n";
        message += "Total Amount for the products " + getAmountDue();
        return message;
    }


    /**
     * Tests the class
     * @param args
     */
    public static void main(String[] args) {
        TimsOrder order = TimsOrder.create();
        System.out.println(order);

    }

}
