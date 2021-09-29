import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while(t-->0)
        {
            Point p1 = new Point(scn.nextDouble(),scn.nextDouble());
            Point p2 = new Point(scn.nextDouble(),scn.nextDouble());
            System.out.println(String.format("%.4f",Point.distanceBetween(p1,p2)));

        }
    }
}
