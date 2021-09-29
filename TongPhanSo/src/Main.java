import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        PhanSo ps1 = new PhanSo(scn.nextLong(), scn.nextLong());
        PhanSo ps2 = new PhanSo(scn.nextLong(),scn.nextLong());

        PhanSo ps3 = new PhanSo();
        ps3 = ps1.cong(ps2);
        System.out.println(ps3.getTuSo()+"/"+ps3.getMauSo());
    }
}
