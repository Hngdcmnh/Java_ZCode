import java.util.ArrayList;
import java.util.Scanner;

public class SapXepChenNguoc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

    }

    public static void sapXep(int a[], int n) {
        ArrayList<String> kq = new ArrayList<String>();
        int i, j, t;

    }

}

public void nhapDaThuc(int[] a,int n)
{
    Scanner scn = new Scanner(System.in);
    for(int i=n;i>=0;i--)
    {
        System.out.print("He so bac "+ i+": ");
        a[i]= scn.nextInt();
        
    }
}

public int calculate(int[] a,int x,int n)
{
    int res =0;
    for(int i=0;i<=n;i++)
    {
        res = res + (int)Math.pow(x, i)*a[i];
    }

    return res;
}