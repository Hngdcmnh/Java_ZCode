import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class SapXepNoiBot {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[1000];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }

        int dem = 0;
        boolean check = true;
        while (check) {
            dem++;
            check = false;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int b = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = b;
                    check = true;
                }

            }
            if (check == false)
                break;
            System.out.print("Buoc " + dem + ": ");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println("");
        }
    }
}
