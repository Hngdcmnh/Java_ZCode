import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//D:\CODE_PRACTICE\ZCode-Java\DanhSachThucTapTH2\src\
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scn1 = new Scanner(new File("D:\\CODE_PRACTICE\\ZCode-Java\\DanhSachThucTapTH2\\src\\SINHVIEN.in"));
        Scanner scn2 = new Scanner(new File("D:\\CODE_PRACTICE\\ZCode-Java\\DanhSachThucTapTH2\\src\\DN.in"));
        Scanner scn3 = new Scanner(new File("D:\\CODE_PRACTICE\\ZCode-Java\\DanhSachThucTapTH2\\src\\THUCTAP.in"));

        int t = Integer.parseInt(scn1.nextLine().trim());
        ArrayList<SinhVien> listSV = new ArrayList<>();
        while(t-->0)
        {
            SinhVien sv = new SinhVien(
                    scn1.nextLine().trim(),
                    scn1.nextLine().trim(),
                    scn1.nextLine().trim(),
                    scn1.nextLine().trim()
            );
            listSV.add(sv);
        }

        t = Integer.parseInt(scn2.nextLine().trim());
        ArrayList<DoanhNghiep> listDN = new ArrayList<>();
        while(t-->0)
        {
            DoanhNghiep dn = new DoanhNghiep(
                    scn2.nextLine().trim(),
                    scn2.nextLine().trim(),
                    Long.parseLong(scn2.nextLine().trim())
            );

            listDN.add(dn);
        }

        t = Integer.parseInt(scn3.nextLine().trim());
        ArrayList<ThucTap> listTT = new ArrayList<>();
        ArrayList<String> listThongTinThucTap = new ArrayList<>();
        while(t-->0)
        {
            String s = scn3.nextLine();
            listThongTinThucTap.add(s);
        }
        Collections.sort(listThongTinThucTap);

        for(String s: listThongTinThucTap)
        {
            SinhVien sv = new SinhVien();
            String[] thongTinThucTap = s.split("\\W");
            for(SinhVien svi: listSV)
            {
                if(svi.getMaSV().equals(thongTinThucTap[0]))
                {
                    sv = new SinhVien(
                            svi.getMaSV(),
                            svi.getTen(),
                            svi.getLop(),
                            svi.getMail()
                    );
                }
            }

            DoanhNghiep dn = new DoanhNghiep();
            for(DoanhNghiep dni: listDN)
            {
                if(dni.getMa().equals(thongTinThucTap[1]))
                {
                    if(dni.getSoLuongDaNhan()<dni.getSoLuong())
                    {
                        dn = new DoanhNghiep(
                                dni.getMa(),
                                dni.getTen(),
                                dni.getSoLuong()
                        );

                        listTT.add(new ThucTap(sv,dn));
                        dni.setSoLuongDaNhan(dni.getSoLuongDaNhan()+1);
                    }
                }
            }
        }

        t = Integer.parseInt(scn3.nextLine());
        while(t-->0)
        {
            String maDN = scn3.nextLine().trim();

            for(DoanhNghiep dn :listDN)
            {
                if(dn.getMa().equals(maDN))
                {
                    System.out.println("DANH SACH THUC TAP TAI "+dn.getTen()+":");
                    break;
                }
            }


            for(ThucTap tt : listTT)
            {
                if(tt.getDoanhNghiep().getMa().equals(maDN))
                {
                    System.out.println(tt.getSinhVien().toString());
                }
            }
        }

    }
}