// import org.jetbrains.annotations.NotNull;

import java.util.*;

public class giaiPTBacNhat {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = 1;
        while (t > 0) {
            t--;
            long a = scn.nextLong();
            long b = scn.nextLong();

            if (a == 0 && b != 0) {
                System.out.print("VN");
            } else if (a == 0 && b == 0) {
                System.out.println("VSN");
            } else {
                double res = -(double) b / (double) a;
                System.out.printf("%.2f", res);

            }
        }
    }
}
