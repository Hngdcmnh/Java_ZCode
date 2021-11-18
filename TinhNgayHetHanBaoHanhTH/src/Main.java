import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scn = new Scanner(new File("MUAHANG.in"));
        int t = Integer.parseInt(scn.nextLine().trim());
        ArrayList<MatHang> list = new ArrayList<>();
        while(t-->0)
        {
            list.add(new MatHang(
                    scn.nextLine().trim(),
                    scn.nextLine().trim(),
                    Integer.parseInt(scn.nextLine().trim()),
                    Integer.parseInt(scn.nextLine().trim())
            ));
        }

        t = Integer.parseInt(scn.nextLine().trim());
    }
}
