import java.util.*;

public class RutGonXauKiTu {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (!st.empty()) {
                char pop = st.pop();
                if (s.charAt(i) != pop) {
                    st.push(pop);
                    st.push(s.charAt(i));
                }
            } else if (st.empty()) {
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        if (st.empty()) {
            System.out.println("Empty String");
        } else {
            while (!st.empty()) {
                sb.insert(0, st.pop());
            }
            System.out.println(sb.toString());
        }

    }
}
