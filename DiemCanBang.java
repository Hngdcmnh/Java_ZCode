// import org.jetbrains.annotations.NotNull;

import java.util.*;

public class DiemCanBang {

    public static void main(String[] args) {
        // sangnt();
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t > 0) {
            t--;
            int n = scn.nextInt();
            int[] a = new int[n + 2];
            int tong = 0;
            for (int i = 1; i <= n; i++) {
                a[i] = scn.nextInt();
                tong += a[i];
            }

            int check = 0;
            int trai = 0;
            for (int i = 1; i <= n; i++) {
                tong = tong - a[i];
                if (tong == trai) {
                    System.out.println(i);
                    check = 1;
                    break;
                }
                trai = trai + a[i];

            }

            if (check == 0)
                System.out.println(-1);
        }
    }

}
