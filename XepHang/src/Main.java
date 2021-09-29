import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        ArrayList<Thoigian> list = new ArrayList<>();
        while(t-->0)
        {
            Thoigian tg = new Thoigian(scn.nextInt(),scn.nextInt());
            list.add(tg);
        }

        Collections.sort(list);
        for()

    }
}
