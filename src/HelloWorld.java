import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] arg) {

        int i = Integer.parseInt("abc");
        System.out.println("i = " + i);



      /*  System.out.println("Hello World");
int a =0;

        while(a<15){
            a++;
         if (a<8) continue;

            System.out.println("a = " + a);


        }

*/

        Scanner s = new Scanner(System.in);
     /*   System.out.println("enter char");
        char ch = s.next().charAt(0); // in order to read char from Scanner
        System.out.println("ch = " + ch);
        System.out.println("enter char again");
        char ch1 = (char) s.nextInt();
        System.out.println("ch1 = " + ch1);*/


       String str = s.next();
        String str1 = s.next();
        if (str == str1) System.out.println("yes");



    }

}
