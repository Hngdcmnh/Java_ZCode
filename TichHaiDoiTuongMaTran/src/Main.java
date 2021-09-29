import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = Matrix.nextMatrix(sc, n, m);
        Matrix b = Matrix.nextMatrix(sc, m, p);
        System.out.println(a.mul(b));
    }
}
