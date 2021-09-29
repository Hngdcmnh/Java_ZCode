import java.util.Scanner;

public class HinhChuNhat {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int chieuDai = scn.nextInt();
        int chieuRong = scn.nextInt();

        if (chieuDai <= 0 || chieuRong <= 0) {
            System.out.println("0");
        } else {
            System.out.println((chieuDai + chieuRong) * 2 + " " + chieuRong * chieuDai);
        }
    }
}
