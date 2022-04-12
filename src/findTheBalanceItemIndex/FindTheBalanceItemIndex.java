package findTheBalanceItemIndex;

public class FindTheBalanceItemIndex {
    public static void main(String[] args) {
        int[] arr = {1, 9, 2, 8, 5, 3, 7, 4, 6};

        for (int i = 0; i < arr.length; i++) {
            if (sumLeftAndRight(arr, i)) {
                System.out.println("the index that balances this array is: " + i);
                System.out.println("the balancing element is : " + arr[i]);
            }

        }

    }

    public static boolean sumLeftAndRight(int[] arr, int index) {
        int[] sum = {0, 0};
        for (int i = 0; i < index; i++) {
            sum[0] += arr[i];
        }

        for (int i = index + 1; i < arr.length; i++) {
            sum[1] += arr[i];
        }
        return sum[0] == sum[1];
    }
}
