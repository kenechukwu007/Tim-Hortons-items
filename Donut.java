package Assignment7_000791775;

import java.util.Scanner;

/**
 * this is the donut class which implements its diagram along side its relationship
 * author: Ohia William
 */
public class Donut extends TimsProduct implements Consumable {

    private static String description;
    private static int calorieCount;

    /**
     *
     * @param name of the customer
     * @param description of the donut
     * @param cost of the donut
     * @param price of the donut
     * @param calorieCount of the donut
     */
    private Donut(String name, String description, double cost, double price, int calorieCount) {
        super(name, cost, price);
        this.description = description;
        this.calorieCount = calorieCount;
    }


    /**
     *  creates the donut and
     * @return d: the created donut
     */
    public static Donut create(){
        Scanner sc = new Scanner(System.in);
        int donutNum;
        System.out.println("Pick your desired donut; 1 = Chocolate dip, 2 = Maple dip, 3 = regular ");
        donutNum = sc.nextInt();
        if(donutNum == 1){
            description = "Chocolate dip";
        } else if(donutNum == 2){
            description = "Maple dip";
        }else{
            description = "regular";
        }
        int calorieCount = (int) (Math.random()* 10 +1);
        Donut d = new Donut("donut", description, 0.99, 1.99, calorieCount);
        return d;
    }

    /**
     *
     * @return description of the donut
     */
    public String getDescription(){
        return description;
    }


    /**
     *
     * @return the calorie count of the donut
     */
    @Override
    public int getCalorieCount() {
        return calorieCount;
    }

    /**
     *
     * @return returns the method of consumption
     */
    @Override
    public String getConsumptionMethod() {
        return "Eat with any beverage";
    }

    @Override
    public String toString() {
        return "Donut{" + super.getName() + super.toString() + "description={" + getDescription() + ", calorieCount="
                + getCalorieCount() + " " + getConsumptionMethod() + '}';
    }
}
