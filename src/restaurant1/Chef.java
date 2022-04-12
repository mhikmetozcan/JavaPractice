package restaurant1;

public class Chef {

    public String name;
    public int id;
    public double hourlyRate;
    public boolean fullTime;

    public Chef(String name, int id, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.id = id;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void makeOrder(){
        System.out.println(name + " is making an order");
    }

    public void washDishes(){
        System.out.println(name + " is washing the dishes");
    }

    public String toString() {

        String isFullTime = (fullTime)? "Full-Time" : "Part-Time";

        return "Server{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", hourlyRate=" + hourlyRate +
                isFullTime +
                '}';
    }
}
/*
6.2 Create a class called Chef
            Attributes:
                name (String),
employeeID (int), hourlyRate (double), fullTime (boolean)
   Add A constructor that can set all the fields
            Actions: (all void methods)
                makeOrder(): chef's name + "is making an order"
                washDishes(): chef's name + "is washing the dishes"
                toString(): Returns
(String) all the information of a Chef
                    -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"

 */