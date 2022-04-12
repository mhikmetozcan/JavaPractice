package withoutX;

import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Please enter a word");

        String word = s.next();

        int length = word.length();

        if (length % 2 == 0) {



            if (word.substring(0, length / 2).equalsIgnoreCase(word.substring(length / 2))) {

                System.out.println(word + " is a withoutX.palindrome");

            }

        } else if (length % 2 != 0) {

            if (word.substring(0, length / 2).equalsIgnoreCase(word.substring(length / 2 + 1))) {

                System.out.println(word + " is a withoutX.palindrome");

            }
        } else
            System.out.println(word + " is not a withoutX.palindrome");


        s.close();


    }


}

