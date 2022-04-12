package restaurant;

public class LocalRestaurant {
    public static void main(String[] args) {
        Restaurant rest = new Restaurant("Joseph", "Frankfurt", 5);
        Server[] servers ={new Server("mike", 5,12.5,true),new Server("Katy", 26, 12.5,false),new Server("Hans", 2, 15.5,true)};
        Chef[] chefs = {new Chef("john",8,29.99,true), new Chef("taylor", 21,25.49,false)};
        rest.hireServer(servers);
        rest.hireChef(chefs);
        System.out.println(rest);

        rest.hireServer(new Server());

        System.out.println(rest);

        rest.terminateServer(5);
        System.out.println(rest);

        System.out.println(rest.servers.get(0).name + " " +rest.servers.get(1).name);

        System.out.println(rest.chefs.get(0).hourlyRate);
        rest.terminateChef(8);

        System.out.println(rest.servers.get(0).name);
        System.out.println(rest.chefs.get(0).hourlyRate);

    }
}
