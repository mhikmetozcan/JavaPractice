package rectangle;

public class Rectangle {

    private double width, length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width < 0){
            System.err.println("invalid input:" + width);
            System.exit(0);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length < 0){
            System.err.println("invalid input:" + length);
            System.exit(0);
        }
        this.length = length;
    }

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public double calcArea(){
        return width * length;
    }

    public double calcPerimeter(){
        return 2 * (width + length);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}

class Test{
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();

        r1.setWidth(-5);
        r1.setLength(-26);


        System.out.println(r1);

        r1.setWidth(5);
        r1.setLength(10);


        System.out.println(r1.getLength());
        System.out.println(r1.getWidth());

        double d1 = r1.getLength();
        double d2 = r1.getWidth();

        System.out.println( d1 + d2);

        System.out.println(r1);


    }
}



/*
2. Rectangle Task:
2.1 Create a class named Rectangle:
Private variables:
width, length
Encapsulate all the fields
Conditions:
width of the rectangle should not be negative
length of the rectangle should not be negative
Add a constructor that allows user to set all the fields when the object is created.
(If the arguments not valid it should not be set to the instances)
Methods:
calcArea(): returns the area of rectangle
calcPerimeter(): returns the perimeter of rectangle
toString(): can display the width, length, area, and perimeter of rectangle when object is passed in
print statement
 */