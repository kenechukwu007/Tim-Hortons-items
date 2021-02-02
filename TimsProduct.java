package Assignment7_000791775;

/**
 * this class implements the TimsProduct class which implements the commodity interface
 * author: Ohia William
 */
public class TimsProduct implements Commodity {

    /**
     * String name gives the TimsProduct a name
     * Double cost is the cost of the product
     * Double price is the price of the product
     */
    private String name;
    private double cost;
    private double price;

    public TimsProduct(String name, double cost, double price){
        this.name = name;
        this.cost = cost;
        this.price = price;
    }

    /**
     *
     * @return name of the product
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return the cost of producing th product
     */
    @Override
    public double getProductionCost() {
        return cost;
    }

    /**
     *
     * @return the price of the product
     */
    @Override
    public double getRetailPrice() {
        return price;
    }

    /**
     *
     * @return the string method of the class
     */
    @Override
    public String toString() {
        return "TimsProduct{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", price=" + price +
                '}';
    }
}
