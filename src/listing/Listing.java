import java.util.*;

public class Listing {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE

        Scanner s = new Scanner(System.in);

        String [][] listings = {{"Blanket","Charger", "Hat", "Headphones", "Laptop", "Pants", "Pillow", "Smartphone", "Socks", "USB cable"},{"60","25","25","30","200","50","40","1000", "5", "10"}};

        String item = s.nextLine();
        boolean b = false;
        int count =0;
        for (int a = 0; a < listings[0].length;a++){
            if(item.equalsIgnoreCase(listings[0][a])){
                b = true; break;
            }
        }

        for(int a =0 ;!item.equalsIgnoreCase(listings[0][a]) ;a++) {
            count++;
            if (a==9) break;
        }


        if(!b)System.out.println("Invalid item!");
        else{


            int price = Integer.parseInt(listings[1][count]);



            if (price<=100){
                int balance = 100-price;
                System.out.println("Thank you for your purchase! ");
                System.out.println("Your current balance is: " + balance +"$");
            }

            else{
                System.out.println("Sorry, not enough funds on your gift card!");
            }



        }

    }
}

