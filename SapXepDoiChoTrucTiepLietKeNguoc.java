import java.util.*;

public class SapXepDoiChoTrucTiepLietKeNguoc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while (t-- > 0) {
            int n = scn.nextInt();
            int[] a = new int[1000];
            for (int i = 0; i < n; i++) {
                a[i] = scn.nextInt();
            }

            ArrayList<String> list = new ArrayList<String>();
            for (int i = 0; i < n; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append("Buoc " + (i + 1) + ": ");
                for (int j = i + 1; j < n; j++) {
                    if (a[j] < a[i]) {
                        int b = a[i];
                        a[i] = a[j];
                        a[j] = b;
                    }
                }
                for (int j = 0; j < n; j++) {
                    sb.append(Integer.toString(a[j]) + " ");
                }
                list.add(sb.toString());
            }

            for (int i = n - 2; i >= 0; i--) {
                System.out.println(list.get(i));
            }
        }
    }
}
