package diamond;
import java.util.Scanner;
public class Diamond {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


                // TODO Auto-generated method stub
                System.out.println("kaç baklava istiyorsun?");
                int tepsi = s.nextInt();
                System.out.println("satır sayısı gir");
                int satır = s.nextInt();

                for (int l = 0; l < tepsi; l++) {

                    for (int i = 0; i <= satır; i++) {
                        for (int b = satır - i; b > 0; b--) {
                            System.out.print(" ");
                        }
                        for (int a = 0; a < (2 * i - 1); a++) {
                            System.out.print("*");

                        }
                        System.out.println();
                    }

                    int sp = 1;
                    for (int i = satır - 1; i >= 0; i--) {
                        for (int bosluk = 0; bosluk < sp; bosluk++) System.out.print(" ");
                        for (int a = 0; a < 2 * i - 1; a++) {
                            System.out.print("*");
                        }


                        System.out.println();
                        sp++;

                    }

                }


            }}























     /*   int count = 0;
        int j = 4;
        int j2 = j;
        for (int a = 0; a < j; a++){

            for ( int b = 0; b< 2*j2-2;j2--) {
                System.out.print(" ");
                if (count == (2 * j - 2)) {
                    System.out.print("*");
                    count = +2;
                }
            }



        }

    }
}
*/