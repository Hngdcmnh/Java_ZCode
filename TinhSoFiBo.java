import java.util.Scanner;

public class TinhSoFiBo {
    public static void main(String[] args) {
        Scanner scn1 = new Scanner(System.in);
        long t = scn1.nextLong();
        while (t > 0) {
            t--;
            long a = scn1.nextLong();
            long b1, b2, b3 = 0;
            b1 = 0;
            b2 = 1;
            while (a >= 2) {
                b3 = b1 + b2;
                b1 = b2;
                b2 = b3;
                a--;
            }

            System.out.println(b3);
        }

    }
}
