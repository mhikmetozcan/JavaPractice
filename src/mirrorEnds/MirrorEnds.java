package mirrorEnds;
import java.util.Scanner;

public class MirrorEnds {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        String reverse = "";
        String mirror = "";
        for (int a = str.length()-1 ; a >= 0;a--){

            reverse += str.charAt(a);
        }

        for (int a = 0; a < str.length() ; a++){

            if (str.charAt(a)==reverse.charAt(a))

                mirror += str.charAt(a);

              else

                  a = str.length();
        }

        System.out.println(mirror);



    }
}
