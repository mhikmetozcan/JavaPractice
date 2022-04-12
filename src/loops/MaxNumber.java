package loops;

import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);



        int max = -2147483648; // the smallest integer

        for (int a = 0; a < 5; a++) {

            System.out.println("enter a number");
            int i = s.nextInt();

            if(i > max)
                max =i ;

        }

        System.out.println("max = " + max);



        int[] nums = {4,6,2};

        for (int i = 0; i < 2 ; i++){

            int switcch = 0;

            if (nums[i]>nums[i+1]){

                switcch = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = switcch;

            }


        }

        for (int a = 0; a < 3; a++) {
            System.out.print(nums[a] + " ");
        }


    }

}
