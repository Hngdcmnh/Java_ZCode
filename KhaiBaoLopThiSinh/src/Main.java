import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        String hoTen = scn.nextLine();
        String ngayThang = scn.nextLine();
        float diemMon1 = Float.parseFloat(scn.nextLine());
        float diemMon2 = Float.parseFloat(scn.nextLine());
        float diemMon3 = Float.parseFloat(scn.nextLine());
        SinhVien sv1 = new SinhVien(hoTen,ngayThang,diemMon1,diemMon2,diemMon3);
        System.out.println(sv1.getTen() + " " + sv1.getNgayThangNam());
        System.out.println(sv1.getTongDiem());

    }
}

