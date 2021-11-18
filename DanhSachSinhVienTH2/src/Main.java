import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//D:\CODE_PRACTICE\ZCode-Java\DanhSachSinhVienTH2\src\
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scn = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(scn.nextLine().trim());
        ArrayList<SinhVien> list = new ArrayList<>();
        while(t-->0)
        {
            SinhVien sv = new SinhVien(
                    scn.nextLine().trim(),
                    scn.nextLine().trim(),
                    scn.nextLine().trim(),
                    scn.nextLine().trim()
            );
            list.add(sv);

        }
        Collections.sort(list);
        for(SinhVien sv : list)
        {
            System.out.println(sv.toString());
        }
    }
}
