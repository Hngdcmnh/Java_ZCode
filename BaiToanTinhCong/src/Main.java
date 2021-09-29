import java.util.Scanner;

public class Main {
    public static int id = 1;
    public  static void main(String[] args)
    {

        Scanner scn = new Scanner(System.in);
        NhanVien nv1 = new NhanVien(scn.nextLine().trim(),Integer.parseInt(scn.nextLine().trim()),Integer.parseInt(scn.nextLine().trim()),scn.nextLine().trim());
//        System.out.println(nv1.getPosition());
        System.out.println(nv1.getFullId()+" "+nv1.getName()+" "+nv1.getLuong()+" "+nv1.getTienThuong()+" "+nv1.getBonus()+" "+nv1.getThuNhap());
    }
}
