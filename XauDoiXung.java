import java.util.*;

public class XauDoiXung {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while (t-- > 0) {
            String s = scn.nextLine();
            StringBuilder sb = new StringBuilder();
            for (int i = s.length() - 1; i >= 0; i--) {
                sb.append(s.charAt(i));
            }
            int dem = 0;
            // System.out.println(s.length());
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != sb.toString().charAt(i)) {
                    dem++;

                }
            }
            // System.out.println(s);
            // System.out.println(sb.toString());
            //
            // System.out.println(dem);
            if (dem == 0 && s.length() % 2 == 1) {
                System.out.println("YES");
            } else if (dem == 1 || dem == 2) {
                System.out.println("YES");
            } else {

                System.out.println("NO");
            }
        }
    }
}
