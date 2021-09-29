import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine().trim());
        ArrayList<SanPham> listSP = new ArrayList<>();
        while(t-->0)
        {
            SanPham sp = new SanPham(scn.nextLine().trim(), scn.nextLine().trim(),Long.parseLong(scn.nextLine().trim()),Long.parseLong(scn.nextLine().trim()));
            listSP.add(sp);
        }

        int t2 = Integer.parseInt(scn.nextLine().trim());
        ArrayList<DonHang> listDH = new ArrayList<>();
        for(int i=1;i<=t2;i++)
        {
            String don1 = scn.nextLine();
            StringTokenizer st = new StringTokenizer(don1);
            int dem=0;
            String maSanPham="";
            long soLuong = 0;
            String tenSanPham="";
            long giaLoai1=0;
            long giaLoai2=0;
            while(st.hasMoreTokens())
            {
                if(dem==0)   maSanPham = st.nextToken();
                else soLuong =Long.parseLong(st.nextToken());
                dem++;
            }
//            System.out.println(maSanPham);

            for(SanPham sp:listSP)
            {
                if(sp.getMaSanPham().equals(maSanPham.substring(0,2)))
                {
                    tenSanPham = sp.getTenSanPham();
                    giaLoai1 = sp.getGiaLoai1();
                    giaLoai2 = sp.getGiaLoai2();
                }
            }
//            System.out.println(giaLoai1);
//            System.out.println(giaLoai2);
            DonHang dh = new DonHang(i,maSanPham,tenSanPham,soLuong,giaLoai1,giaLoai2);
            System.out.println(dh.toString());

        }
    }
}
