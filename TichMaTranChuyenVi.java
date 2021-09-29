import java.util.*;

public class TichMaTranChuyenVi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        for (int test = 1; test <= t; test++) {

            int n, m;
            n = scn.nextInt();
            m = scn.nextInt();
            int[][] a = new int[1000][1000];
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    a[i][j] = scn.nextInt();
                }
            }

            int[][] b = new int[100][100];
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i != j) {
                        b[i][j] = a[j][i];
                    } else if (i == j) {
                        b[i][j] = a[i][j];
                    }
                }
            }

            // for (int i = 1; i <= m; i++) {
            // for (int j = 1; j <= n; j++) {
            // System.out.print(b[i][j] + " ");

            // }
            // System.out.println("");
            // }

            System.out.println("Test " + test + ":");
            int k = Math.min(n, m);
            int[][] c = new int[1000][1000];
            for (int i = 1; i <= k; i++) {
                for (int j = 1; j <= k; j++) {
                    int x = 0;
                    for (int id = 1; id <= m; id++) {
                        x = x + a[i][id] * b[id][j];
                    }

                    System.out.print(x + " ");
                }
                System.out.println("");
            }

        }

    }
}
