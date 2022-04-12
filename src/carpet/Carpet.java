package carpet;

public class Carpet {

    private double width, length, unitPrice;
    private boolean isPersian;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width < 0){
            System.err.println("invalid input : " +width);
            System.exit(0);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length < 0){
            System.err.println("invalid input : " + length);
            System.exit(0);
        }
        this.length = length; 
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice < 0 ){
            System.err.println("invalid input : " + unitPrice);
            System.exit(0);
        }
        this.unitPrice = unitPrice;
    }

    public boolean isPersian() {
        return isPersian;
    }

    public void setPersian(boolean persian) {
        isPersian = persian;
    }


    public Carpet() {
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        setWidth(width);
        setLength(length);
        setUnitPrice(unitPrice);
        setPersian(isPersian);
    }

    public double calcCost(){

        double basePrice = width * length * unitPrice;
        double price = basePrice;

        if(isPersian){
            price += 200;
        }

        return price;

    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", price = $" + calcCost() +
                '}';
    }
}


class Test{

    public static void main(String[] args) {

        Carpet c1 = new Carpet(5,20,10.99,false);

        System.out.println(c1);

    }


}

/*
3.1create a class named Carpet:
private variables:
width, length, unitPrice, isPersian (boolean)
Encapsulate all the fields:
Conditions:
width can not be negative
length can not be negative
unit price can not be negative
Add a constructor to set all the instances
instance methods:
calcCost(): should be able to calculate the total
cost of the carpet and return it as double
total price of carpet = (width*length)*unitPrice
if the carpet is persian  carpet, add 200$ to the totalPrice
toString(): should be able to display all the info
of the carpet including the total cost of the carpet as calculated by calcCost()
 */