import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws ParseException, CloneNotSupportedException {
        Scanner scn = new Scanner(System.in);
        ArrayList<KhachHang> listKH = new ArrayList<>();
        ArrayList<MatHang> listMH = new ArrayList<>();
        ArrayList<HoaDon> listHD = new ArrayList<>();

        int n = Integer.parseInt(scn.nextLine().trim());
        for(int i=1;i<=n;i++)
        {
            KhachHang kh = new KhachHang(
                    i,
                    scn.nextLine().trim(),
                    scn.nextLine().trim(),
                    scn.nextLine().trim(),
                    scn.nextLine().trim()
            );

            listKH.add(kh);
        }

//        System.out.println(listKH.toString());

        int m = Integer.parseInt(scn.nextLine().trim());
        for(int i=1;i<=m;i++)
        {
            MatHang mh = new MatHang(
                    i,
                    scn.nextLine().trim(),
                    scn.nextLine().trim(),
                    Long.parseLong(scn.nextLine().trim()),
                    Long.parseLong(scn.nextLine().trim())
            );

            listMH.add(mh);
        }

        int k = Integer.parseInt(scn.nextLine().trim());
        for(int i=1;i<=k;i++)
        {
            String hoaDon = scn.nextLine().trim();
            StringTokenizer st = new StringTokenizer(hoaDon);
            KhachHang kh1 = new KhachHang();
            MatHang mh1 = new MatHang();
            int soLuong;
            ArrayList<String> hoaDonChiTiet = new ArrayList<>();
            while(st.hasMoreTokens())
            {
                hoaDonChiTiet.add(st.nextToken());
            }

//            System.out.println(hoaDonChiTiet.toString());

            for(KhachHang kh : listKH)
            {
                if(kh.getMa().equals(hoaDonChiTiet.get(0)))
                {
                    kh1=(KhachHang) kh.clone();
//                    System.out.println("kkk");
                    break;
                }
            }

            for(MatHang mh : listMH)
            {
                if(mh.getMa().equals(hoaDonChiTiet.get(1)))
                {
                    mh1 = (MatHang) mh.clone();
//                    System.out.println(mh.getGiaBan());
                    break;
                }
            }


            HoaDon hd = new HoaDon(i,kh1,mh1,Integer.parseInt(hoaDonChiTiet.get(2)));
            System.out.println(hd.toString());
        }
    }
}
