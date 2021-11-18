import java.io.FileInputStream;
import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois2.readObject();

        Map<Integer,Integer> map1 = new TreeMap<>();
        Map<Integer,Integer> map2 = new TreeMap<>();


        for(Integer i :list1)
        {
            if(isPrime(i)) {
                if (map1.containsKey(i)) {
                    int count = map1.get(i);
                    map1.remove(i);
                    map1.put(i, count + 1);
                } else {
                    map1.put(i, 1);
                }
            }
        }

        for(Integer i :list2)
        {
            if(map1.containsKey(i)) {
                if(map2.containsKey(i))
                {
                    int count = map2.get(i);
                    map2.remove(i);
                    map2.put(i,count+1);
                }
                else
                {
                    map2.put(i,1);
                }
            }
        }

        for(Integer i :map1.keySet())
        {
            System.out.println(i+" "+map1.get(i)+" "+map2.get(i));
        }
    }

    private static boolean isPrime(Integer n) {
        if(n<2)
        {
            return false;
        }
        else
        {
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
