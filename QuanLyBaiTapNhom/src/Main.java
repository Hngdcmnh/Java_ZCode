import java.util.ArrayList;
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
//        System.out.println(listpj.toString());

        int q = Integer.parseInt(scn.nextLine().trim());
        for(int i=1;i<=q;i++)
        {

            int pjNum = Integer.parseInt(scn.nextLine().trim());
            System.out.println("DANH SACH NHOM "+i+":");
            for(SinhVien sv : listsv)
            {
                if(sv.getProjectNum() == pjNum)
                {
                    System.out.println(sv.toString());
                }
            }
            System.out.println("Bai tap dang ky: "+listpj.get(pjNum));
        }
    }
}
