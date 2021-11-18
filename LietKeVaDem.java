import java.util.*;

public class LietKeVaDem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> alist = new ArrayList<>();
        HashMap<Integer, Integer> mp = new HashMap<>();
        int k = 20;
        while (k-- > 0) {
            int n = scn.nextInt();
            if (check(n)) {
                if (mp.containsKey(n)) {
                    mp.put(n, mp.get(n) + 1);
                } else {
                    mp.put(n, 1);
                    alist.add(n);
                }
            }
        }
        Collections.sort(alist, (Integer a, Integer b) -> mp.get(a).compareTo(mp.get(b)));
        for (Integer x : alist) {
            System.out.println(x + " " + mp.get(x));
        }
    }

    public static boolean check(int n) {
        String s = "" + n;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
