import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        for(int i=1;i<=t;i++)
        {
            NhanVien nv = new NhanVien(i,scn.nextLine().trim(),scn.nextLine().trim(),scn.nextLine().trim(),scn.nextLine().trim(),scn.nextLine().trim(),scn.nextLine().trim());
            System.out.println(nv.toString());
        }
    }
}
