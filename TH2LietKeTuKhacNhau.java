import java.util.*;
import java.io.*;

public class TH2LietKeTuKhacNhau {
    public static void main(String[] args) throws IOException {

        int sum = 0;
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNext()) {
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            while (st.hasMoreTokens()) {
                String x = st.nextToken();
                // System.out.println(x);
                if (isInteger(x)) {
                    sum += Integer.parseInt(x);
                }
            }
        }
        System.out.print(sum);
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }
}
