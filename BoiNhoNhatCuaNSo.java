// import org.jetbrains.annotations.NotNull;

import java.util.*;

public class BoiNhoNhatCuaNSo {
    public static long a[] = new long[10002];

    public static void main(String[] args) {
        // sangnt();
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t > 0) {
            t--;
            long b = scn.nextLong();
            long res = 1;
            for (int i = 1; i <= b; i++) {
                if (res % i != 0) {
                    int j = i;
                    while (j * i <= b) {
                        j = j * i;
                    }
                    res = res * j;
                }
            }
            System.out.println(res);
        }

    }

    // public static void sangnt() {
    // a[0] = 1;
    // a[1] = 0;
    // for (int i = 2; i <= 10000; i++) {
    // if (a[i] == 0) {
    // for (int j = i * 2; j <= 10000; j = j + i) {
    // a[j] = 1;
    // }
    // }
    // }
    // }
}
