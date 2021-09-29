// import org.jetbrains.annotations.NotNull;

import java.util.*;

public class TinhTong {
    public static long a[] = new long[10002];

    public static void main(String[] args) {
        // sangnt();
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        long res = 0;
        while (t > 0) {
            t--;
            long b = scn.nextLong();
            System.out.println((1 + b) * b / 2);
        }
    }

}
