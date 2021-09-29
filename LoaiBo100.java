import java.util.*;

public class LoaiBo100 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while (t > 0) {
            t--;
            // System.out.println(t);
            String s = scn.nextLine();
            Stack st = new Stack<Integer>();
            int dem = 0;
            st.push(0);
            st.push(1);
            // System.out.println(s.charAt(1));
            // System.out.println(s.charAt(2));
            // System.out.println(s.charAt(3));
            for (int i = 2; i < s.length(); i++) {
                if (st.size() >= 2) {
                    int a1 = (int) st.pop();
                    int a2 = (int) st.pop();
                    // System.out.println(i+" -- "+Character.toString(s.charAt(i)));
                    // System.out.println(a1+" -- "+ Character.toString(s.charAt(a1)));
                    // System.out.println(a2+" -- "+ Character.toString(s.charAt(a2)));
                    if (Character.toString(s.charAt(i)).equals("0") && Character.toString(s.charAt(a1)).equals("0")
                            && Character.toString(s.charAt(a2)).equals("1")) {
                        // System.out.println("l");
                        if (st.size() != 0) {
                            if (dem < i - a2 + 1)
                                dem = i - a2 + 1;
                        } else {
                            if (dem < i)
                                dem = i + 1;
                        }
                    } else {
                        st.push(a2);
                        st.push(a1);
                        st.push(i);
                    }
                } else {
                    st.push(i);
                    // System.out.println(i);
                }

            }

            System.out.println(dem);
        }
    }
}
