package isContainingTheCharSequence;

import java.util.Scanner;

public class IsContainingTheCharSequence {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("please enter a text");
        String str1 = s.nextLine();
        System.out.println(str1.length());
        System.out.println("please enter the sub text you would like to check if exists in the previous text");
        String str2 = s.nextLine();
        int i = str2.length();
        boolean b= false;

        for (int a = 0; a<str1.length()-(i-1); a++){

            if((str1.substring(a,a+i)).equalsIgnoreCase(str2)){
                b =true;
            }
        }

           if (b)  System.out.println("b = " + b);
                else System.out.println("b = false");
    }

}
