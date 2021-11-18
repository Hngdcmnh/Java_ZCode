import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public  static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois2.readObject();

        Collections.sort(list1);
        Map<Integer,Integer> map = new TreeMap<>();

        int[] nto = new int[1000001];
        nto[0]=1;
        nto[1]=1;
        nto[2]=0;
        for(int i=2;i<=1000000;i++)
        {
            if(nto[i]==0)
            {
                for(int j = 2*i;j<=1000000;j+=i)
                {
                    nto[j]=1;
                }
            }
        }

        for(Integer i:list1)
        {
            if(i>500000)
            {
                break;
            }
            if(nto[i]==0 && nto[1000000-i]==0 && list1.contains(1000000-i) &&  !list2.contains(i) && !list2.contains(1000000-i))
            {
                map.put(i,1000000-i);
            }
        }

        for(Integer i : map.keySet())
        {
            System.out.println(i+" "+map.get(i));
        }
    }

//    private static boolean isPrime(Integer n) {
//        if(n<2)
//        {
//            return false;
//        }
//        else
//        {
//            for(int i=2;i*i<=n;i++)
//            {
//                return false;
//            }
//            return true;
//        }
//    }

}

//class Pair
//{
//    private int num1;
//    private int num2;
//
//    public Pair(int num1, int num2) {
//        this.num1 = num1;
//        this.num2 = num2;
//    }
//}
