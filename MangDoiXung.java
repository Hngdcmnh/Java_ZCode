import java.util.Scanner;
import java.util.ArrayList;

public class MangDoiXung {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long t = scn.nextLong();
        while (t > 0) {
            t--;
            int n = scn.nextInt();
            long[] a = new long[1000];
            long[] b = new long[1000];

            for (int i = 0; i < n; i++) {
                a[i] = scn.nextLong();
                b[n - i - 1] = a[i];
            }

            boolean check = false;
            for (int i = 0; i < n; i++) {
                if (a[i] != b[i]) {
                    System.out.println("NO");
                    check = true;
                    break;
                }
            }

            if (check == false) {
                System.out.println("YES");
            }
        }
    }
}
