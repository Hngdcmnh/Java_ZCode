import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
//D:\CODE_PRACTICE\ZCode-Java\DanhSachSinhVienTrongFile\src\
public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner scn = new Scanner(new File("SV.in"));
        int t = Integer.parseInt(scn.nextLine().trim());
//        String t = scn.nextLine().trim();
//        System.out.println(t);
        for(int i=1;i<=t;i++)
        {
            SinhVien sv = new SinhVien(i,
                    scn.nextLine().trim(),
                    scn.nextLine().trim(),
                    scn.nextLine().trim(),
                    Float.parseFloat(scn.nextLine().trim()));

            System.out.println(sv.toString());
        }
    }
}

