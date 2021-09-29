import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class SapXepChen {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = scn.nextInt();
            if (list.size() == 0) {
                list.add(0, a);
            } else {
                for (int j = 0; j <= list.size(); j++) {
                    if (j < list.size() && list.get(j) > a) {
                        list.add(j, a);
                        break;
                    }
                    if (j == list.size()) {
                        list.add(j, a);
                        break;
                    }
                }
            }
            System.out.print("Buoc " + i + ": ");
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j) + " ");
            }
            System.out.println("");

        }

    }
}
