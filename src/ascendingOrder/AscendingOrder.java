package ascendingOrder;

import java.util.Scanner;


/*
Her nasılsa dizi içindeki sıralama yüksekten düşüüğe gerçekleşti.
fakat çıktı istenildiği gibi alındı
 */

public class AscendingOrder {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("enter dimension");
        int[] numbers = new int[s.nextInt()];
        System.out.println("enter the numbers which needs to be put in an ascending order");
        for (int a = 0; a < numbers.length; a++)

            numbers[a] = s.nextInt();

        for (int a = 0; a < numbers.length - 1; a++) {

            for (int b = 0; b < numbers.length - 1; b++) {

                if (numbers[b + 1] > numbers[b]) {

                    int x = numbers[b];
                    numbers[b] = numbers[b + 1];
                    numbers[b + 1] = x;
                }

            }

        }

        for (int a = numbers.length; a > 0; a--)

            System.out.print(numbers[a-1]+ " ");

    }

}
