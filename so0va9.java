import java.util.*;

public class so0va9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            Queue<Integer> q = new LinkedList<>();
            q.add(9);

            while (true) {
                int x0 = q.poll();

                if (x0 % n == 0) {
                    System.out.println(x0);
                    break;
                }

                // System.out.println(x0);
                q.add(x0 * 10);
                q.add(x0 * 10 + 9);

            }
        }
    }
}
