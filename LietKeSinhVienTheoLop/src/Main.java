import java.util.ArrayList;
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
            String year = scn.nextLine().trim();
            System.out.println("DANH SACH SINH VIEN KHOA "+year+":");
            for(SinhVien sv :list)
            {
//                System.out.println(sv.getClassName().substring(1,3));
//                System.out.println(year.substring(2,4));
                if(sv.getClassName().substring(1,3).equals(year.substring(2,4)))
                {
                    System.out.println(sv.toString());
                }
            }
        }

    }
}
