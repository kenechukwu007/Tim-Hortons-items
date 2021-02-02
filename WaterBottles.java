package Assignment7_000791775;

import java.util.Scanner;

/**
 * this code implements a sub class of TimsProduct that uses the Commodity interface
 * author: Ohia William
 */

public class WaterBottles extends TimsProduct implements Commodity {

    // instance variable color
    private static String color;

    /**
     *
     * @param name of the bottle
     * @param cost of the bottle
     * @param price of the bottle
     * @param color of the bottle
     */
    private WaterBottles(String name, double cost, double price, String color) {
        super(name, cost, price);
        this.color = color;
    }

    /**
     * creates the water bottle and
     * @return 'w' the created water bottle
     */
    public static WaterBottles create(){
        Scanner sc = new Scanner(System.in);
        int bottleNum;
        System.out.println("What color of Water bottle do you want? 1 = Green, 2 = Yellow, 3 = Black");
        bottleNum = sc.nextInt();
        if(bottleNum == 1){
            color = "Green";
        } else if(bottleNum == 2){
            color = "Yellow";
        }else{
            color = "Black";
        }
        WaterBottles w = new WaterBottles("Gatorade",1.20,10.99, color);
        return w;
    }

    /**
     *
     * @return color of the water bottle
     */
    public String getColor(){
        return color;
    }

    @Override
    public String toString() {
        return "Water Bottle{" + super.getName() + super.toString() + '{' + "Details " + color + '}';
    }
}
