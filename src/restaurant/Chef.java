package restaurant;

public class Chef {

    public String name;
    public int id;
    public double hourlyRate;
    public boolean fullTime;

    public Chef() {

    }

    public Chef(String name, int id, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.id = id;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void makeOrder(){
        System.out.println(name + " is preparing the order");
    }

    public void washDishes(){
        System.out.println(name + " is washing the dishes");
    }

    public String toString() {

        String full =(fullTime)?" full-time ":" part-time ";

        return "Chef{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", hourlyRate=" + hourlyRate +
                full+
                '}';
    }
}
