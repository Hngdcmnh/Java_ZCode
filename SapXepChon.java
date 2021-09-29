import java.util.Scanner;
import java.util.ArrayList;

public class SapXepChon {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[1000];
        for (int i = 1; i <= n; i++) {
            a[i] = scn.nextInt();
        }

        for (int i = 1; i < n; i++) {
            int id = i;
            for (int j = i + 1; j <= n; j++) {
                if (a[id] > a[j]) {
                    id = j;
                }
            }
            int b = a[i];
            a[i] = a[id];
            a[id] = b;
            System.out.print("Buoc " + i + ": ");
            for (int k = 1; k <= n; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println("");

        }
    }
}
