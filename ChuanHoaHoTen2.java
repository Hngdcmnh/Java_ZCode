import java.util.*;

public class ChuanHoaHoTen2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while (t > 0) {
            t--;
            // System.out.println(t);
            String s = scn.nextLine();
            System.out.println(chuanHoa(s));
        }
    }

    public static String chuanHoa(String s) {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);

        StringBuilder firstName = new StringBuilder();
        int x = st.countTokens();
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            if (st.countTokens() == x - 1) {
                for (int j = 0; j < word.length(); j++) {
                    firstName.append(Character.toUpperCase(word.charAt(j)));
                }
            } else {
                sb.append(Character.toUpperCase(word.charAt(0)));
                for (int j = 1; j < word.length(); j++) {
                    sb.append(Character.toLowerCase(word.charAt(j)));
                }
                if (st.countTokens() > 0)
                    sb.append(" ");
            }
        }
        sb.append(", ");
        sb.append(firstName);
        return sb.toString();

    }
}
