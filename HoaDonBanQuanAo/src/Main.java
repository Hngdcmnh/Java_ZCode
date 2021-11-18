import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine().trim());
        ArrayList<SanPham> listSP = new ArrayList<>();
        while(n-->0)
        {
            SanPham sp = new SanPham(
                    scn.nextLine().trim(),
                    scn.nextLine().trim(),
                    Long.parseLong(scn.nextLine().trim()),
                    Long.parseLong(scn.nextLine().trim())
            );

            listSP.add(sp);
        }

        int m = Integer.parseInt(scn.nextLine().trim());
        for(int i=1;i<=m;i++)
        {
            String hoaDon = scn.nextLine().trim();
            ArrayList<String> hoaDonChiTiet = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(hoaDon);
            while(st.hasMoreTokens())
            {
                hoaDonChiTiet.add(st.nextToken());
            }

            String maSP = hoaDonChiTiet.get(0).substring(0,2);
            int loaiSP = Integer.parseInt(hoaDonChiTiet.get(0).substring(2,3));
            long soLuong = Long.parseLong(hoaDonChiTiet.get(1));
            String tenSp = "";
            long gia=0;

            for(SanPham sp : listSP)
            {
                if(sp.getMa().equals(maSP))
                {
                    tenSp = sp.getTen();
                    if(loaiSP ==1)
                    {
                        gia = sp.getGia1();
                    }
                    else
                    {
                        gia = sp.getGia2();
                    }
                    break;
                }
            }

            HoaDon hd = new HoaDon(i,hoaDonChiTiet.get(0),tenSp,gia,soLuong);
            System.out.println(hd.toString());

        }
    }
}
