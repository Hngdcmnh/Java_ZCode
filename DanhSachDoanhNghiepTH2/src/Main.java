import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//D:\CODE_PRACTICE\ZCode-Java\DanhSachDoanhNghiepTH2\src\
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scn = new Scanner(new File("DN.in"));
        int t = Integer.parseInt(scn.nextLine().trim());
        ArrayList<DoanhNghiep> list = new ArrayList<>();
        while(t-->0)
        {
            DoanhNghiep dn = new DoanhNghiep(
                    scn.nextLine().trim(),
                    scn.nextLine().trim(),
                    Long.parseLong(scn.nextLine().trim())
            );

            list.add(dn);

        }

        Collections.sort(list);
        for(DoanhNghiep d : list)
        {
            System.out.println(d.toString());
        }
    }
}
