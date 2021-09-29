import java.util.*;

public class BoiChungUocChung {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t > 0) {
            t--;
            long a = scn.nextLong();
            long b = scn.nextLong();
            long uoc = uocChung(a, b);
            long boi = a * b / uoc;
            System.out.println(boi + " " + uoc);

        }

    }

    public static long uocChung(long a, long b) {
        while (a * b != 0) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }

        return a + b;
    }
}
