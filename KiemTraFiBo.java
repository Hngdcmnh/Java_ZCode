
import java.util.*;

public class KiemTraFiBo {

    public static void main(String[] args) {

        Set<Long> b = new HashSet<Long>();
        Long b0 = Long.valueOf(0);
        Long b1 = Long.valueOf(1);
        b.add(b0);
        b.add(b1);
        for (int i = 2; i < 100; i++) {
            Long b2 = b0 + b1;
            b.add(b2);
            b0 = b1;
            b1 = b2;
        }

        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        for (long i = 0; i < n; i++) {
            Long x = scn.nextLong();
            if (b.contains(x)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
