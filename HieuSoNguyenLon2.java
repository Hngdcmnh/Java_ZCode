import java.util.*;
import java.math.BigInteger;

public class HieuSoNguyenLon2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // int t = Integer.parseInt(scn.nextLine());
        // while(t-->0)
        // {
        int length = 0;
        BigInteger a = scn.nextBigInteger();
        BigInteger b = scn.nextBigInteger();
        BigInteger c = a.subtract(b);
        java.lang.String s = c.toString();

        StringBuilder sb = new StringBuilder();

        boolean check = true;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == 0) {
                continue;
            } else {
                check = false;
            }
            if (check == false) {
                sb.append(s.charAt(i));
            }
        }

        if ((s.charAt(0) == '0' || s.charAt(0) == '-') && sb.toString() == "0") {
            System.out.println("0");
        } else {
            System.out.print(s.charAt(0));
            System.out.println(sb.toString());
        }
    }

}
