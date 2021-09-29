import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        HCN hcn = new HCN(scn.nextDouble(),scn.nextDouble(),scn.nextLine().trim());
        if((hcn.getHeight() <=0 || hcn.getWidth()<=0) || (hcn.getHeight()*hcn.getWidth() != (int)hcn.getHeight()* (int)hcn.getWidth()))
        {
            System.out.println("INVALID");
        }
        else
        {
            System.out.println((int)hcn.getChuVi() + " " + (int)hcn.getDienTich() + " " + hcn.getColor());
        }
    }
}
