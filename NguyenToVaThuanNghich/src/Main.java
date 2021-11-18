import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        ArrayList<Integer> list1 = (ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois2.readObject();

        int[] dd1 = new int[10005];
        int[] dd2 = new int[10005];

        for(int i=0;i<=10000;i++)
        {
            dd1[i]=0;
            dd2[i]=0;
        }

        for(Integer i : list1)
        {
            if(isPalin(i) && isPrime(i))
            {
                dd1[i]+=1;
            }
        }

        for(Integer i:list2)
        {
            if(isPalin(i) && isPrime(i))
            {
                dd2[i]+=1;
            }
        }

// why??? -> use integer x: list2 sorted -> WA
//        Collections.sort(list2);
//
//        for(Integer x : list2)
//        {
//            if(dd1[x]>0 && dd2[x]>0)
//            {
//                System.out.println(x+" "+ dd1[x]+" "+dd2[x]);
//            }
//        }

        for(int x=0;x<10000;x++)
        {
            if(dd1[x]>0 && dd2[x]>0)
            {
                System.out.println(x+" "+ dd1[x]+" "+dd2[x]);
            }
        }
    }

    private static boolean isPalin(int n) {
        String s = String.valueOf(n);
        StringBuilder s1 = new StringBuilder();
        s1.append(s);
        s1.reverse();
        return s.equals(s1.toString());
    }

    private static boolean isPrime(int n) {
        if(n<2)
        {
            return false;
        }
        else{
            for(int i=2;i*i<=n;i++)
            {
                if(n%i==0)
                {
                    return false;
                }
            }
            return true;
        }
    }
}

