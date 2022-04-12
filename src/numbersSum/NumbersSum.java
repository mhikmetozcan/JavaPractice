package numbersSum;

import java.util.Scanner;

public class NumbersSum {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("enter a text");
        String str = s.nextLine();

        System.out.println("the sum of the numbers within the given text is: " + sumNumbers(str));


    }

    public static int sumNumbers(String str) {

        int sum = 0;

        int constant = 1;

        for (int a = str.length() - 1; 0 <= a; a--) {


            if (str.charAt(a) >= '0' && str.charAt(a) <= '9') {

                sum += Integer.parseInt("" + str.charAt(a)) * constant;

                constant *= 10;

            }

            if (str.charAt(a) < '0' || str.charAt(a) > '9')

                constant = 1;

        }
        return sum;
    }

}