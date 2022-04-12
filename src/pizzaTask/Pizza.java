package pizzaTask;

public class Pizza {

    private String size;
    private int cheese, pepperoni;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {

        switch (size.toLowerCase()){
            case "small" : break;
            case "medium" : break;
            case "large" : break;
            default:
                System.err.println("invalid size :" + size); System.exit(0);
        }
        size = size.toLowerCase();
        this.size = size;
    }

    public int getCheese() {
        return cheese;
    }

    public void setCheese(int cheese) {

        if (cheese < 0) {
            System.err.println("invalid cheese :" + cheese);
            System.exit(0);
        }

        if((size.equals("small") && cheese < 4) || (size.equals("medium") && cheese < 5) || (size.equals("large") && cheese < 6))
        this.cheese = cheese;
        else {
            System.err.println("invalid cheese :" + cheese);
            System.exit(0);
        }
    }

    public int getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(int pepperoni) {
        if (pepperoni < 0) {
            System.err.println("invalid pepperoni :" + pepperoni);
            System.exit(0);
        }

        if((size.equals("small") && pepperoni < 5) || (size.equals("medium") && pepperoni < 6) || (size.equals("large") && pepperoni < 7))
            this.pepperoni = pepperoni;
        else {
            System.err.println("invalid pepperoni :" + pepperoni);
            System.exit(0);
        }
    }

    public Pizza(String size, int cheese, int pepperoni) {
        setSize(size);
        setCheese(cheese);
        setPepperoni(pepperoni);
    }

    public Pizza(){

    }

    public int calcCost(){

        int[] basePrice = {10,12,14};

        int toppings = 2 * (cheese + pepperoni);

        return (size.equals("small"))?basePrice[0]+toppings:(size.equals("medium"))? basePrice[1]+toppings:basePrice[2]+toppings;

    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ",number of cheese=" + cheese +
                ",number of pepperoni=" + pepperoni +
                ",price=" + calcCost() +
                '}';
    }
}

class PizzaTest{


    public static void main(String[] args) {

        Pizza dominos = new Pizza("LaRgE", 5,6);

        System.out.println(dominos);


    }

}