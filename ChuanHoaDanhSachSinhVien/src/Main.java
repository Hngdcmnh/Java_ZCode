import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;
//D:\CODE_PRACTICE\ZCode-Java\ChuanHoaDanhSachSinhVien\src\
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner scn = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(scn.nextLine().trim());
        for(int i=1;i<=t;i++)
        {
            SinhVien sv = new SinhVien(
                    i,
                    scn.nextLine().trim(),
                    scn.nextLine().trim(),
                    scn.nextLine().trim(),
                    Float.parseFloat(scn.nextLine().trim())
            );
            System.out.println(sv.toString());
        }

    }
}
