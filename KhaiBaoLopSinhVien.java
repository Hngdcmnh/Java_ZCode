import java.util.*;

public class KhaiBaoLopSinhVien {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String hoTen = scn.nextLine();
        String ngayThang = scn.nextLine();
        float diemMon1 = Float.parseFloat(scn.nextLine());
        float diemMon2 = Float.parseFloat(scn.nextLine());
        float diemMon3 = Float.parseFloat(scn.nextLine());
        SinhVien sv1 = new SinhVien(hoTen, ngayThang, diemMon1, diemMon2, diemMon3);
        System.out.println(sv1.getTen() + " " + sv1.getNgayThangNam() + " " + sv1.getTongDiem());

    }
}

class SinhVien {
    private String ten;
    // private int ngaySinh;
    // private int thangSinh;
    // private int namSinh;
    private String ngayThangNam;
    private float diemMon1;
    private float diemMon2;
    private float diemMon3;

    public SinhVien(String ten, String ngayThangNam, float diemMon1, float diemMon2, float diemMon3) {
        this.ten = ten;
        // this.ngaySinh = ngaySinh;
        // this.thangSinh = thangSinh;
        // this.namSinh = namSinh;
        this.ngayThangNam = ngayThangNam;
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
        this.diemMon3 = diemMon3;
    }

    public float getTongDiem() {
        return this.diemMon1 + this.diemMon2 + this.diemMon3;
    }

    public String getNgayThangNam() {
        return ngayThangNam;
    }

    public void setNgayThangNam(String ngayThangNam) {
        this.ngayThangNam = ngayThangNam;
    }

    public void setDiemMon1(float diemMon1) {
        this.diemMon1 = diemMon1;
    }

    public void setDiemMon2(float diemMon2) {
        this.diemMon2 = diemMon2;
    }

    public void setDiemMon3(float diemMon3) {
        this.diemMon3 = diemMon3;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    // public int getNgaySinh() {
    // return ngaySinh;
    // }
    //
    // public void setNgaySinh(int ngaySinh) {
    // this.ngaySinh = ngaySinh;
    // }
    //
    // public int getThangSinh() {
    // return thangSinh;
    // }
    //
    // public void setThangSinh(int thangSinh) {
    // this.thangSinh = thangSinh;
    // }
    //
    // public int getNamSinh() {
    // return namSinh;
    // }
    //
    // public void setNamSinh(int namSinh) {
    // this.namSinh = namSinh;
    // }

    public void setDiemMon1(int diemMon1) {
        this.diemMon1 = diemMon1;
    }

    public void setDiemMon2(int diemMon2) {
        this.diemMon2 = diemMon2;
    }

    public void setDiemMon3(int diemMon3) {
        this.diemMon3 = diemMon3;
    }
}
