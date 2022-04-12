package ascendingOrder;

public class evenlySpaced {

    public static void main(String[] args) {

        int[] nums = {4,6,2};

        for (int i = 0; i < 2; i++)
        for (int a = 0; a < 2 ; a++){

            int switcch = 0;

            if (nums[a]>nums[a+1]){

                switcch = nums[a];
                nums[a] = nums[a+1];
                nums[a+1] = switcch;

            }


        }

        for (int i = 0; i < 3; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.printf("\nldkf");


    }

}
