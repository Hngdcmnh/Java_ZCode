import java.util.*;
import java.math.*;

public class ChiaHetCho11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while (t-- > 0) {
            int length = 0;
            BigInteger a = scn.nextBigInteger();
            String s = a.toString();
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) {
                    sum += Integer.parseInt(Character.toString(s.charAt(i)));
                } else {
                    sum -= Integer.parseInt(Character.toString(s.charAt(i)));

                }
            }
            if (sum % 11 == 0) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }

        }
    }
}
