import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        ArrayList<HocSinh> arrayList = new ArrayList<>();
        for(int i=1;i<=t;i++)
        {
            String name = scn.nextLine().trim();
            String diem = scn.nextLine().trim();

            HocSinh hs = new HocSinh(i,name,diem);
            arrayList.add(hs);
        }
        Collections.sort(arrayList);
        for(HocSinh hs : arrayList)
        {
            System.out.println(hs.toString());
        }
    }
}
