import java.util.*;
import java.math.*;

public class TongSoNguyenLon1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while (t-- > 0) {
            BigInteger a = scn.nextBigInteger();
            BigInteger b = scn.nextBigInteger();
            System.out.println(a.add(b));

        }
    }
}
