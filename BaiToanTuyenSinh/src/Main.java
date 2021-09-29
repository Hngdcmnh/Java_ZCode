import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        ThiSinh ts1 = new ThiSinh(scn.nextLine().trim(),scn.nextLine().trim(),Double.parseDouble(scn.nextLine().trim()),Double.parseDouble(scn.nextLine().trim()),Double.parseDouble(scn.nextLine().trim()));
        System.out.print(ts1.getId()+" "+ts1.getName()+" ");
        if(ts1.getDiemUT()==(int)ts1.getDiemUT())
        {
            System.out.print((int)ts1.getDiemUT()+" ");
        }
        else
        {
            System.out.print(String.format("%.1f",ts1.getDiemUT())+" ");
        }
        if(ts1.getDiem()==(int)ts1.getDiem())
        {
            System.out.print((int)ts1.getDiem()+" ");
        }
        else
        {
            System.out.print(String.format("%.1f",ts1.getDiem())+" ");
        }
        System.out.print(ts1.getStatus());
    }
}
