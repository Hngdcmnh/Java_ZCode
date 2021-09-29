// import org.jetbrains.annotations.NotNull;

import java.util.*;

public class TongUocSo {
    public static long a[] = new long[2000001];
    public static long b[] = new long[2000001];

    public static void main(String[] args) {
        sangnt();
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        long sum = 0;
        long res = 0;
        while (t > 0) {
            t--;
            int c = scn.nextInt();
            sum += b[c];
        }
        System.out.println(sum);
    }

    public static void sangnt() {
        a[0] = 0;
        a[1] = 0;
        for (int i = 2; i <= 2000000; i++) {
            if (a[i] == 0) {
                for (int j = i * 2; j <= 2000000; j = j + i) {
                    a[j] = 1;
                }
            }
        }

        for (int j = 0; j <= 2000000; j++) {
            if (a[j] == 0) {
                b[j] = j;
            } else {
                for (int i = 2; i * i <= j; i++) {
                    if (j % i == 0) {
                        b[j] = b[i] + b[j / i];
                        break;
                    }
                }
            }
        }

    }
}
