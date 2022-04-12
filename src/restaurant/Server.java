package restaurant;

public class Server {

    public String name;
    public int id;
    public double hourlyRate;
    public boolean fullTime;

    public Server(){

    }

    public Server(String name, int id, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.id = id;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void takeOrder(){
        System.out.println(name + " is taking an order");
    }

    public void cleanTable(){
        System.out.println(name + " is cleaning the table");
    }

    public String toString() {

        String full =(fullTime)?" full-time ":" part-time ";

        return "Server{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", hourlyRate=" + hourlyRate + full +
                '}';
    }
}
