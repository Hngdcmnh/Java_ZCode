
import java.util.*;

public class UocChiaHetCho2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t > 0) {
            t--;
            int dem = 0;
            long a = scn.nextLong();
            for (int i = 1; i * i <= a; i++) {
                if (a % i == 0) {
                    if (i % 2 == 0)
                        dem++;
                    if (a / i % 2 == 0 && i * i != a)
                        dem++;
                }
            }
            System.out.println(dem);
        }

    }

}
