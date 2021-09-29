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
            Point p3 = new Point(scn.nextDouble(),scn.nextDouble());

            double a = Point.distanceBetween(p1,p2);
            double b = Point.distanceBetween(p2,p3);
            double c = Point.distanceBetween(p1,p3);

//            System.out.println(a+" "+b+" "+c);
            if(a+b>c && b+c>a && a+c>b)
            {
                double p = a+b+c;
                double s1 = 0.25*Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c));
                double s = Math.round(s1*100)/100;
                double r = a*b*c/(4*s1);
                System.out.println(String.format("%.3f",Math.PI*r*r));
            }
            else
            {
                System.out.println("INVALID");
            }
        }
    }
}
