package Assignment7_000791775;

import java.util.Scanner;

/**
 * this code implements another sub class of TimsProduct that implements the consumable interface
 * author: Ohia William
 */
public class Muffin extends TimsProduct implements Consumable {

    private static String description;
    private static int calorieCount;

    /**
     *
     * @param name of the muffin
     * @param description of the muffin
     * @param cost of the muffin
     * @param price of the muffin
     * @param calorieCount of the muffin
     */
    private Muffin(String name, String description, double cost, double price, int calorieCount) {
        super(name, cost, price);
        this.description = description;
        this.calorieCount = calorieCount;
    }

    /**
     *  creates the muffin and
     * @return 'm' the created muffin
     */
    public  static Muffin create(){
        Scanner sc = new Scanner(System.in);
        int muffinNum;
        System.out.println("What type of muffin do you want: 1 = chocolate Chip, 2 = Peanut Butter, 3 = Berries Burst");
        muffinNum = sc.nextInt();
        if(muffinNum == 1){
            description = "Chocolate Chip";
        }else if(muffinNum == 2){
            description = "Peanut Butter";
        }else {
            description = "Berries Burst";
        }
        int calorieCount = (int) (Math.random() * 10 + 1);
        Muffin m = new Muffin("Breakfast muffin", description, 0.50, 1.39, calorieCount);
        return m;


    }

    /**
     *
     * @return the description of the muffin
     */
    public String getDescription(){
        return description;
    }

    /**
     *
     * @return the calorie count
     */
    @Override
    public int getCalorieCount() {
        return calorieCount;
    }

    /**
     *
     * @return the method of consumption
     */
    @Override
    public String getConsumptionMethod() {
        return "Eat with any beverage";
    }

    @Override
    public String toString() {
        return "Muffin{" + super.getName() + super.toString() + "description={" + getDescription() + ", calorieCount="
                + getCalorieCount() + " " + getConsumptionMethod() + '}';
    }
}

