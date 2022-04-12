package restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner, location;
    public int numOfStars;
    ArrayList<Server>  servers = new ArrayList<>();
    ArrayList<Chef>    chefs = new ArrayList<>();

    public Restaurant() {

    }

    public Restaurant(String owner, String location, int numOfStars) {
        this.owner = owner;
        this.location = location;
        this.numOfStars = numOfStars;
    }

    public void hireServer(Server server){
        servers.add(server);
    }

    public void hireServer(Server[] servers){
        this.servers.addAll(Arrays.asList(servers));
    }

    public void hireChef(Chef chef){
        chefs.add(chef);
    }

    public void hireChef(Chef[] chefs){
        this.chefs.addAll(Arrays.asList(chefs));
    }

    public void terminateServer(int id){
        servers.removeIf(p -> p.id == id);
    }

    public void terminateChef(int id){
        chefs.removeIf(p-> p.id == id);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", number of Stars=" + numOfStars +
                ", number of Servers=" + servers.size() +
                ", number of Chefs=" + chefs.size() +
                '}';
    }
}
