import java.util.Scanner;
import java.util.*;

public class SapXepChonLietKeNguoc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[1000];
        for (int i = 1; i <= n; i++) {
            a[i] = scn.nextInt();
        }

        Stack<String> st = new Stack<String>();
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
            StringBuilder sb = new StringBuilder();
            sb.append("Buoc " + i + ": ");
            for (int k = 1; k <= n; k++) {
                sb.append(a[k] + " ");
            }
            st.push(sb.toString());
        }

        while (!st.empty()) {
            System.out.println(st.pop());
        }

    }
}
