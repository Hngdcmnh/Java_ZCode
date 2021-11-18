import java.io.*;
import java.lang.reflect.Array;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> list  = (ArrayList<Integer>) ois.readObject();
        Map<Integer,Integer> map = new TreeMap();
        for(Integer x : list)
        {
            if(isPrime(x))
            {
                if(map.containsKey(x))
                {
                    int count = map.get(x);
                    map.remove(x);
                    map.put(x,count+1);
                }
                else
                {
                    map.put(x,1);
                }
            }

        }
        for(Integer x: map.keySet())
        {
            System.out.println(x+" "+map.get(x));
        }
    }

    private static boolean isPrime(Integer n) {
        if(n < 2)
        {
            return false;
        }
        for(int i = 2; i*i <= n; i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }



}

//public class J07015 {
//    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ObjectInputStream file = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
//        ArrayList<Integer> ds = (ArrayList<Integer>) file.readObject();
//        int a[] = new int[10000];
//        for(Integer i : ds) {
//            if(isPrime(i)) {
//                a[i]++;
//            }
//        }
//        for(int i=0; i<10000; i++) {
//            if(a[i]>0) {
//                System.out.println(i+" "+a[i]);
//            }
//        }
//    }
//
//    private static boolean isPrime(Integer k) {
//        if(k < 2)
//            return false;
//        for(int i = 2; i*i <= k; i++)
//            if(k%i == 0)
//                return false;
//        return true;
//    }
//}