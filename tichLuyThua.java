// import org.jetbrains.annotations.NotNull;

import java.util.*;

public class tichLuyThua {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long mod = (long) (1e9 + 7);
        while (true) {
            long a = scn.nextLong();
            long b = scn.nextLong();

            if (a == 0 && b == 0)
                break;

            long m = 1;
            while (b > 0) {
                b--;
                m = ((m % mod) * (a % mod)) % mod;
            }
            System.out.println(m);
        }
    }
}
