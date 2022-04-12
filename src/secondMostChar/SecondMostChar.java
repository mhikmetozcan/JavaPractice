package secondMostChar;

import java.util.Scanner;

public class SecondMostChar {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int charr = 56893;

        System.out.println("please enter a text");
        String str1 = s.nextLine();
        String str = str1.replaceAll(" ","");

        //char array will be declared at the length of the string
        char[] ch = new char[str.length()];

        //the chars of the given string will be assigned on each index of the ch array
        for (int a = 0; a < ch.length; a++) ch[a] = str.charAt(a);

        // counter
        int[] count = new int[str.length()];
        int[] sortedCount = new int[str.length()];
        for (int a = 0; a < str.length(); a++) count[a] = 1;

        // counting each char and recording the count in the count array
        for (int a = 0; a < str.length(); a++) {

            int b = a + 1;
            while (b < str.length()) {
                if (ch[a] == ch[b]) {

                    count[a]++;
// here, a counted char is being changed to a weird char that is most possibly not existing in the scanned text, however very amateur way
                    ch[b] = (char) charr;
                    charr++;
                }
                b++;
            }
        }

        for (int a = 0; a < str.length(); a++) {

            sortedCount[a] = count[a];

        }


        for (int a = 0; a < count.length; a++) {

            for (int b = a + 1; b < count.length; b++) {

                int x = 0;
                if (sortedCount[b] > sortedCount[a]) {

                    x = sortedCount[a];
                    sortedCount[a] = sortedCount[b];
                    sortedCount[b] = x;

                }
            }
        }


        for (int a = 0; a < count.length; a++) {

            if (sortedCount[a]==sortedCount[1] && a==0) continue;
                else if (sortedCount[1] == count[a]){
                System.out.println("the second most existing character in this String is : " + str.charAt(a));
            }
        }
    }
}


