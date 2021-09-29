import java.util.*;

public class DiaChiEmail {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        ArrayList<String> arrayList = new ArrayList<>();
        while (t-- > 0) {
            String s = scn.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            StringBuilder sb = new StringBuilder();

            while (st.countTokens() > 1) {
                String x = st.nextToken();
                sb.append(Character.toLowerCase(x.charAt(0)));
            }

            String x = st.nextToken();
            sb.insert(0, x.toLowerCase());
            // System.out.println("---"+sb.toString()+"---");
            if (!arrayList.contains(sb.toString())) {
                arrayList.add(sb.toString());
                sb.append("@ptit.edu.vn");
            } else if (arrayList.contains(sb.toString())) {
                int dem = 0;
                arrayList.add(sb.toString());
                for (String tmp : arrayList) {
                    if (tmp.equals(sb.toString()))
                        dem++;
                }
                sb.append(dem + "@ptit.edu.vn");
            }

            System.out.println(sb.toString());
        }
    }
}
