import java.util.Scanner;

public class PhanTichSoNT {
    public static void main(String[] args) {
        Scanner scn1 = new Scanner(System.in);
        long t = scn1.nextLong();

        for (int j = 1; j <= t; j++) {
            System.out.print("Test " + j + ":" + " ");
            long a = scn1.nextLong();
            for (long i = 2; i <= a; i++) {
                if (a % i == 0) {
                    int dem = 0;
                    while (a % i == 0) {
                        a = a / i;
                        dem++;
                    }
                    System.out.print(i + "(" + dem + ") ");
                }
            }
            System.out.println("");
        }
    }
}
