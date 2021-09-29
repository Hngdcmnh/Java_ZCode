// import org.jetbrains.annotations.NotNull;

import java.util.*;

public class chiaTamGiac {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t > 0) {
            t--;
            long n = scn.nextLong();
            long h = scn.nextLong();
            for (int i = 1; i < n; i++) {
                double res = Math.sqrt((double) i / (double) n) * (double) h;
                System.out.printf("%.6f", res);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

}
