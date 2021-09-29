// import org.jetbrains.annotations.NotNull;

import java.util.*;

public class uocSoNguyenToMax {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t > 0) {
            t--;
            long res = 0;
            long a = scn.nextLong();
            for (long i = 2; i * i <= a; i++) {
                if (a % i == 0) {
                    while (a % i == 0) {
                        a = a / i;
                    }
                    res = i;
                }
            }
            if (a != 1 && a >= res) {
                res = a;
            }
            System.out.println(res);

        }
    }

    // public static boolean check(String s)
    // {
    // int[] a = new int[10];
    // for(int i=0;i<10;i++)
    // {
    // if(i == 2 || i ==3 || i==5 || i==7) a[i]=1;
    // else a[i]=0;
    // }
    // int length = s.length();
    // String s1="";
    // for(int i=0;i<length;i++)
    // {
    // s1 = s.charAt(i)+s1;
    // if(a[Integer.parseInt(String.valueOf(s.charAt(i)))]==0 )
    // {
    // return false;
    // }
    // }
    // if(!s1.equals(s)) return false;
    // return true;
    // }

}
