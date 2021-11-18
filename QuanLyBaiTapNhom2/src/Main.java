import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n,m;
        n = scn.nextInt();
        m = scn.nextInt();
        String x = scn.nextLine();
        ArrayList<SinhVien> listsv = new ArrayList<>();
        ArrayList<String> listpj = new ArrayList<>();
        while(n-->0)
        {
            SinhVien sv = new SinhVien(scn.nextLine().trim(),scn.nextLine().trim(),scn.nextLine().trim(),Integer.parseInt(scn.nextLine().trim()));
            listsv.add(sv);
//            System.out.println(sv.toString());
        }
        listpj.add("");
        while(m-->0)
        {
            listpj.add(scn.nextLine().trim());
        }

        Collections.sort(listsv);
        for(SinhVien sv1 : listsv)
        {
            sv1.setProject(listpj);
            System.out.println(sv1);
        }

    }
}
