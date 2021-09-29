import java.util.Scanner;

// import static java.lang.StrictMath.*;

public class SoNguyenTo {

    public static void main(String[] args) {
        Scanner scn1 = new Scanner(System.in);
        long t = scn1.nextLong();
        while (t > 0) {
            t--;
            long a = scn1.nextLong();
            long dem = 0;
            for (long i = 2; i * i <= a; i++) {
                if (a % i == 0) {
                    dem++;
                }
            }
            if (dem > 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

    }

}