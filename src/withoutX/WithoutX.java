package withoutX;

import java.util.Scanner;

public class WithoutX {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        if (str.length() <= 1) str += "  "; // so that str.charAt(1) is not out of boundary

     //   str.substring(0,2).replace("x", "").trim()+str.substring(2).trim();  Also does the very same job as the code below !!!!!!!!!!!!!!!!!!!!!!

        boolean x = str.charAt(0) != 'x' && str.charAt(1) != 'x';

        if (x)

            System.out.println("str = " + str.trim());

        String[] chars = new String[str.length()];

        for (int a = 0; a < chars.length; a++) {

            chars[a] = "" + str.charAt(a);

        }

        if (chars[0].equalsIgnoreCase("x"))

            chars[0] = "";

        if (chars[1].equalsIgnoreCase("x"))

            chars[1] = "";

        for (int a = 0; a < chars.length; a++)
            System.out.print(chars[a]);

        System.out.println();

        str = "";

        for (int a = 0; a < chars.length; a++) {

            str += chars[a];

        }

        System.out.println("str1 = " + str);

    }

}
