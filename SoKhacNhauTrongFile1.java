
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SoKhacNhauTrongFile1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scn = new Scanner(new File("DATA.in"));
        // ArrayList<Integer> listI = new ArrayList<>();
        int[] a = new int[10000];
        for (int i = 0; i < 10000; i++)
            a[i] = 0;
        while (scn.hasNext()) {
            String s = scn.nextLine();
            // System.out.println(s);

            StringTokenizer st = new StringTokenizer(s);
            while (st.hasMoreTokens()) {
                int x = Integer.parseInt(st.nextToken());
                a[x] += 1;
                // listI.add(x);
            }
        }
        
        for (int i = 0; i <= 1000; i++) {
            if (a[i] > 0) {
                System.out.println(i + " " + a[i]);
            }
        }
    }
}
