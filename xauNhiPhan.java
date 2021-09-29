// import org.jetbrains.annotations.NotNull;

import java.util.*;

public class xauNhiPhan {
    public static long a[] = new long[20001];

    public static void main(String[] args) {
        tinhDoDai();
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t > 0) {
            t--;
            int n = scn.nextInt();
            long k = scn.nextLong();
            System.out.println(solve(k, n));
        }
    }

    public static void tinhDoDai() {
        a[1] = 1;
        a[2] = 1;
        for (int i = 3; i <= 93; i++) {
            a[i] = a[i - 2] + a[i - 1];
        }
    }

    public static long solve(long k, int n) {
        if (n == 1)
            return 0;
        else if (n == 2)
            return 1;
        else {
            if (k <= a[n - 2])
                return solve(k, n - 2);
            else
                return solve(k - a[n - 2], n - 1);
        }
    }
}