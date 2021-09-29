
import java.util.Scanner;
import java.util.ArrayList;

public class SapXepDoiChoTrucTiep {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[1000];
        for (int i = 1; i <= n; i++) {
            a[i] = scn.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            int check = 0;

            for (int j = i + 1; j <= n; j++) {
                if (a[i] > a[j]) {
                    int b = a[i];
                    a[i] = a[j];
                    a[j] = b;
                    check = 1;
                }
            }

            if (check == 1) {
                System.out.print("Buoc " + i + ": ");
                for (int k = 1; k <= n; k++) {
                    System.out.print(a[k] + " ");
                }
                System.out.println("");
            } else {
                break;
            }

        }
    }
}
