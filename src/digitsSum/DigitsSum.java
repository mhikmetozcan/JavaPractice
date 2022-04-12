package digitsSum;

import java.util.Scanner;

public class DigitsSum {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("enter a number whose digits you wish to be summed");

        int i = s.nextInt();
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            i /= 10;
        }
        System.out.println("sum = " + sum);
    }
}
