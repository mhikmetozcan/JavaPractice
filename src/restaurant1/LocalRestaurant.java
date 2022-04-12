package restaurant1;

import restaurant.Chef;
import restaurant.Server;

public class LocalRestaurant {

    public static void main(String[] args) {

        Restaurant rest = new Restaurant("Mike", "Berlin", 4);

        Server[] servers ={new Server("mike", 5,12.5,true), new Server("Katy", 26, 12.5,false),new Server("Hans", 2, 15.5,true)};

        Chef[] chefs = {new Chef("john",8,29.99,true), new Chef("taylor", 21,25.49,false)};


      // rest.hireServer(servers);

    }

}

/*
Create a class LocalRestaurant that has a main
method with the following:
        - Make a Restaurant object
        - Create an array of servers with their
information set. Add those initial servers to the ArrayList of Servers in
the Restaurant object
            - Create an array of chefs with their
information set. Add those initial chefs to the ArrayList of Chefs in the
Restaurant object
            - Print your whole restaurants information
 */