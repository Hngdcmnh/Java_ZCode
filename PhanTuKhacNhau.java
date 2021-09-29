import java.util.*;

public class PhanTuKhacNhau {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n, m;
        n = scn.nextInt();
        m = scn.nextInt();
        int[] a = new int[10002];
        int[] b = new int[10002];
        Set set = new HashSet();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
            set.add(a[i]);
        }

        for (int j = 0; j < m; j++) {
            b[j] = scn.nextInt();
            if (set.contains(b[j])) {
                list.add(b[j]);
                set.remove(b[j]);
            }
        }

        for (Integer k : list) {
            System.out.println(k);
        }

    }

}
