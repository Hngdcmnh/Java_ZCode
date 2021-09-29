import java.util.*;
import java.math.*;

public class UocChungLonNhatSoNguyenLon {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // int t = Integer.parseInt(scn.nextLine());
        // while (t-- > 0) {
        BigInteger a = scn.nextBigInteger();
        BigInteger b = scn.nextBigInteger();
        String res = String.valueOf(a.add(b));
        StringBuilder sb = new StringBuilder();
        int check = 0;
        for (int i = 0; i < res.length(); i++) {
            if (check == 0) {
                continue;
            } else if (res.charAt(i) != '0' && check == 0) {
                check = 1;
                sb.append(res.charAt(i));
            } else if (check == 1) {
                sb.append(res.charAt(i));
            }
        }
        System.out.println(sb.toString());

        // }
    }
}
