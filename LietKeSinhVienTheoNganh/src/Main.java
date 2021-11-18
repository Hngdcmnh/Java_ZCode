import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();
        while(t-->0)
        {
            SinhVien sv = new SinhVien(scn.nextLine().trim(),scn.nextLine().trim(),scn.nextLine().trim(),scn.nextLine().trim());
            list.add(sv);
        }

        int t2 = Integer.parseInt(scn.nextLine());
        while(t2-->0)
        {
//            String nameClass = scn.nextLine().trim();
            String nganh = scn.nextLine().trim().toUpperCase(Locale.ROOT);
            System.out.println("DANH SACH SINH VIEN NGANH "+nganh+":");
            StringBuilder sb = new StringBuilder();
            if(nganh.equals("KE TOAN"))
            {
                sb.append("KT");
            }
            else if(nganh.equals("CONG NGHE THONG TIN"))
            {
                sb.append("CN");
            }
            else if(nganh.equals("AN TOAN THONG TIN"))
            {
                sb.append("AT");
            }
            else if(nganh.equals("VIEN THONG"))
            {
                sb.append("VT");
            }
            else if(nganh.equals("DIEN TU"))
            {
                sb.append("DT");
            }


            for(SinhVien sv :list)
            {
//                System.out.println(sv.getId().substring(5,7));
//                System.out.println(sv.getClassName().substring(0,1));
                if(sv.getId().substring(5,7).equals(sb.toString()) )
                {
                    System.out.println(sv.toString());
                }
            }
        }

    }
}
