package getBetween;

public class GetBetween {

    public static void main(String[] args) {

        char[] arr = {'a', 'b', 'S', 'D', 'E', 'T', 'Q', 'A'};

        System.out.println(getBetween(arr, 'b' , 'Q'));
    }


    public static String getBetween(char[] arr, char ch, char ch1){

        String statement = "";

        for (char each : arr) {
            statement += "" + each;
        }

        int firstLetterIndex = statement.indexOf(ch);
        int secondLetterIndex = statement.indexOf(ch1, firstLetterIndex);

        return statement.substring(firstLetterIndex + 1, secondLetterIndex);

    }

}
