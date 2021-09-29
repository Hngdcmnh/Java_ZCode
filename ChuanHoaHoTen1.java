// import org.jetbrains.annotations.NotNull;

import java.util.*;

public class ChuanHoaHoTen1 {
    // public static int a[] = new int[2000001];

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while (t > 0) {
            t--;
            String s = scn.nextLine();
            System.out.println(chuanHoa(s));
        }
    }

    public static String chuanHoa(String s) {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            sb.append(Character.toUpperCase(word.charAt(0)));
            for (int i = 1; i < word.length(); i++) {
                sb.append(Character.toLowerCase(word.charAt(i)));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
