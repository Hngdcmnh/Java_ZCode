import java.util.*;
import java.math.*;

public class TongSoNguyenLon2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // int t = Integer.parseInt(scn.nextLine());
        // while(t-->0)
        // {
        int length = 0;
        BigInteger a = scn.nextBigInteger();
        BigInteger b = scn.nextBigInteger();
        BigInteger c = a.add(b);
        java.lang.String s = c.toString();

        boolean check = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 0) {
                continue;
            } else {
                check = false;
            }
            if (check == false) {
                System.out.print(s.charAt(i));
            }
        }
    }

}
