// import org.jetbrains.annotations.NotNull;

import java.util.*;

public class SoDep1 {
    public static long a[] = new long[10002];

    public static void main(String[] args) {
        // sangnt();
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        long res = 0;
        while (t > 0) {
            t--;
            String s = scn.next();
            String s1 = "";
            for (int i = 0; i < s.length(); i++) {
                s1 = s.charAt(i) + s1;
            }

            if (s1.equals(s) && check(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean check(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.getNumericValue(s.charAt(i)) % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
