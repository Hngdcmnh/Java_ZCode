import java.util.*;

public class LietKeToHop {
    public static int[] a = new int[1000];
    public static int n, k;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        k = scn.nextInt();

        for (int i = 1; i <= k; i++)
            a[i] = i;
        out();
        int dem = 0;
        while (true) {
            int i = k;
            dem++;
            while (i >= 1 && a[i] == n - k + i)
                i--;
            if (i == 0) {
                break;
            } else {
                a[i] += 1;
                for (int j = i + 1; j <= n; j++) {
                    a[j] = a[j - 1] + 1;
                }
                out();
            }

        }

        System.out.println("");
        System.out.println("Tong cong co " + dem + " to hop");

    }

    public static void out() {
        for (int i = 1; i <= k; i++) {
            System.out.print(a[i]);
        }
        System.out.print(" ");
    }
}
