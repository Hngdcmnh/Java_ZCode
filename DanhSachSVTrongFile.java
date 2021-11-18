import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DanhSachSVTrongFile {
    public static void main(String[] args) throws ParseException {
        Scanner scn = new Scanner("SV.in");
        // int t = Integer.parseInt(scn.nextLine().trim());
        String t = scn.nextLine().trim();
        System.out.println(t);
        for (int i = 1; i <= t; i++) {
            SinhVien1 sv = new SinhVien1(i, scn.nextLine().trim(), scn.nextLine().trim(), scn.nextLine().trim(),
                    Float.parseFloat(scn.nextLine().trim()));

            System.out.println(sv.toString());
        }
    }
}

class SinhVien1 {
    private String ten;
    private String lop;
    private Date ns;
    private float GPA;
    private String maSV;

    public SinhVien1(int STT, String ten, String lop, String ns, float GPA) throws ParseException {
        this.maSV = "B19DCCN" + String.format("%03d", STT);
        this.ten = ten;
        this.lop = lop;
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return maSV + " " + ten + " " + lop + " " + ns.toString() + " " + GPA;
    }
}
