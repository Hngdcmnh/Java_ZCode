import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> list = (ArrayList<String>) ois.readObject();
        Map<String,Integer> map = new TreeMap<>();


        for(String i :list)
        {
            String[] listStr = i.toLowerCase(Locale.ROOT).split("\\W");
            for(String x: listStr)
            {
                if(!x.equals(""))
                {
                    if(map.containsKey(x))
                    {
                        map.put(x,map.get(x)+1);
                    }
                    else
                    {
                        map.put(x,1);
                    }
                }

            }

        }

        ArrayList<Pair> listP = new ArrayList<>();

        for(String x : map.keySet())
        {
            listP.add(new Pair(x,map.get(x)));
        }

        Collections.sort(listP);
        for(Pair x : listP)
        {
            System.out.println(x.toString());
        }


    }
}

class Pair implements Comparable<Pair>
{
    private String s;
    private int num;

    public Pair(String s, int num) {
        this.s = s;
        this.num = num;
    }


    @Override
    public int compareTo(Pair o) {
        if(this.num==o.num)
        {
            return this.s.compareTo(o.s);
        }
        else
        {
            return o.num - this.num;
        }
    }

    @Override
    public String toString()
    {
        return this.s+" "+this.num;
    }
}
