public class Circle {

    public double radius;
    public double diameter;
    public static final double pi = 3.14;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
        this.diameter = this.radius * 2;
    }

    public double calcArea(){
       return  pi * radius * radius;
    }

    public void increaseRadius(){
       this.radius *= 2;
    }

    public double calcPerimeter(){
        return 2 * pi * radius;
    }

    public void printPi(){
        System.out.println(pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", pi=" + pi +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}


class CircleTest{

    public static void main(String[] args) {

     Circle c1 = new Circle(5.2);

        System.out.println(c1);

        c1.increaseRadius();

        System.out.println(c1);


    }

}





/*
 Create a class named Circle:
Attributes:
instance: radius, diameter
static: pi
Add a constructor that can set All the
fields (instances)

Actions:
calcArea(): returns the area of Circle
calcPerimeter(): returns the perimeter of Circle
printPi(): displays PI value
toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of
circle is passed in the print statement
 */