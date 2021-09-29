// import org.jetbrains.annotations.NotNull;

import java.util.*;

public class soDep2 {

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
        int length = s.length();
        if (s.charAt(0) != '8' || s.charAt(length - 1) != '8') {
            return false;
        }
        int sum = 0;
        String s1 = "";
        for (int i = 0; i < length; i++) {
            s1 = s.charAt(i) + s1;
            sum = sum + Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        if (sum % 10 != 0)
            return false;
        if (!s1.equals(s))
            return false;
        return true;
    }

}
