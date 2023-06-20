import java.util.Scanner;
public class daireAlnCvr {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);

        System.out.println("Dairenin Yarı Çapını Giriniz : ");

        r = inp.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r ;

        System.out.println("Daireni Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);



    }
}
