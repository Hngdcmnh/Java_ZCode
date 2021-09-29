import java.util.*;

public class TapTuRiengCuaHaiXau {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while (t-- > 0) {
            HashSet<String> hashSet = new HashSet();
            String s1 = scn.nextLine();
            String s2 = scn.nextLine();
            StringTokenizer st2 = new StringTokenizer(s2);
            while (st2.hasMoreTokens()) {
                String s = st2.nextToken();
                if (hashSet.contains(s) == false) {
                    hashSet.add(s);
                }
            }

            ArrayList<String> arrayList = new ArrayList<>();

            StringTokenizer st1 = new StringTokenizer(s1);
            while (st1.hasMoreTokens()) {
                String s = st1.nextToken();
                if (hashSet.contains(s) == false) {
                    arrayList.add(s);
                    hashSet.add(s);
                }
            }

            Collections.sort(arrayList);

            for (String a : arrayList) {
                System.out.print(a + " ");
            }
            System.out.println("");

        }

    }
}
