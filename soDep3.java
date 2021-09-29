// import org.jetbrains.annotations.NotNull;

import java.util.*;

public class soDep3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t > 0) {
            t--;
            String s = scn.next();
            if (check(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }

    public static boolean check(String s) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            if (i == 2 || i == 3 || i == 5 || i == 7)
                a[i] = 1;
            else
                a[i] = 0;
        }
        int length = s.length();
        String s1 = "";
        for (int i = 0; i < length; i++) {
            s1 = s.charAt(i) + s1;
            if (a[Integer.parseInt(String.valueOf(s.charAt(i)))] == 0) {
                return false;
            }
        }
        if (!s1.equals(s))
            return false;
        return true;
    }

}
