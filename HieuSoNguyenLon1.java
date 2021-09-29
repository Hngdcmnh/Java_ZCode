import java.util.*;
import java.math.*;

public class HieuSoNguyenLon1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while (t-- > 0) {
            int length = 0;
            BigInteger a = scn.nextBigInteger();
            BigInteger b = scn.nextBigInteger();
            length = Math.max(a.toString().length(), b.toString().length());
            BigInteger c = a.subtract(b).abs();
            length = length - c.toString().length();
            while (length-- > 0) {
                System.out.print("0");
            }
            System.out.println(c);

        }

    }
}