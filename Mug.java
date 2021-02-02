package Assignment7_000791775;

import javafx.scene.paint.Color;

import java.util.Scanner;

/**
 * this code implements the mug class which is a subclass of TimsProduct
 * author: Ohia William
 */

public class Mug extends TimsProduct implements Commodity {

    // instance variable color
    private static String color;

    /**
     *
     * @param name of the mug
     * @param cost of the mug
     * @param price of the mug
     * @param color of the mug
     */
    private Mug(String name, double cost, double price, String color) {
        super(name, cost, price);
        this.color = color;
    }

    /**
     * here the user interacts with the system and the system creates the mug based on user input
     * @return the mug
     */
    public static Mug create(){
        Scanner sc = new Scanner(System.in);
        int mugNumber;
        System.out.println("What color of mug do you want? 1 = Red, 2 = white, 3 = blue");
        mugNumber = sc.nextInt();
        if(mugNumber == 1){
            color = "RED";
        } else if(mugNumber == 2){
            color = "White";
        }else{
            color = "Blue";
        }
        Mug m1 = new Mug("Happyman",1.2,7.0,color);
        return m1;
    }

    /**
     *
     * @return color of the mug
     */
    public String getColor(){
        return color;
    }

    @Override
    public String toString() {
        return "Mug{" + super.getName() + super.toString() + '{' + "Details " + color + '}';
    }
}
