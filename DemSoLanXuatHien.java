import java.util.Scanner;
import java.util.ArrayList;

public class DemSoLanXuatHien {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for (int j = 1; j <= t; j++) {
            int n = scn.nextInt();
            int[] a = new int[10000];
            int[] b = new int[10000];

            for (int i = 0; i < n; i++) {
                a[i] = scn.nextInt();
                b[a[i]]++;
            }

            System.out.println("Test " + j + ":");
            for (int i = 0; i < n; i++) {
                if (b[a[i]] > 0) {
                    System.out.println(a[i] + " xuat hien " + b[a[i]] + " lan ");
                    b[a[i]] = 0;
                }
            }

        }
    }
}
