import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
         Scanner scn = new Scanner(System.in);
        ArrayList<SinhVien> list = new ArrayList<>();
        int n=Integer.parseInt(scn.nextLine());
        while(n-->0)
        {
//            if(scn.nextLine()==null) break;
            SinhVien sv1 = new SinhVien(scn.nextLine().trim(),scn.nextLine().trim(),scn.nextLine().trim(),scn.nextLine().trim());
            list.add(sv1);
        }
        Collections.sort(list);
        for(SinhVien sv :list)
        {
            System.out.println(sv.toString());
        }
    }
}
