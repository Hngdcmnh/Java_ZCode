import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
//D:\CODE_PRACTICE\ZCode-Java\HoaDon-1\src\
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scn1 = new Scanner(new File("DATA1.in"));
        Scanner scn2 = new Scanner(new File("DATA2.in"));

        int t = Integer.parseInt(scn1.nextLine().trim());
        ArrayList<SanPham> listSP = new ArrayList<>();
        while(t-->0)
        {
            SanPham sp = new SanPham(
                    scn1.nextLine().trim(),
                    scn1.nextLine().trim(),
                    Long.parseLong(scn1.nextLine().trim()),
                    Long.parseLong(scn1.nextLine().trim())
            );

            listSP.add(sp);
        }

        int k = Integer.parseInt(scn2.nextLine());
        for(int i=1;i<=k;i++)
        {
            String[] hoaDonChiTiet = scn2.nextLine().trim().split("\\W");
            String tenSP="";
            long gia=0;
            for(SanPham sp : listSP)
            {
                if(sp.getMaSP().equals(hoaDonChiTiet[0].substring(0,2)))
                {
                    if(hoaDonChiTiet[0].substring(2,3).equals("1"))
                    {
                        gia = sp.getGia1();
                    }
                    else
                    {
                        gia = sp.getGia2();
                    }

                    HoaDon hd = new HoaDon(
                        i,
                        hoaDonChiTiet[0],
                        sp.getTenSP(),
                        gia,
                        Integer.parseInt(hoaDonChiTiet[1]));

                    System.out.println(hd.toString());
                    break;
                }
            }



        }


    }
}
