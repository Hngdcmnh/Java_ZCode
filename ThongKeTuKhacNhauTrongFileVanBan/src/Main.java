import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
//D:\CODE_PRACTICE\ZCode-Java\ThongKeTuKhacNhauTrongFileVanBan\src\
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scn = new Scanner(new File("VANBAN.in"));

        Map<String,Integer> map = new HashMap<>();
        int t = Integer.parseInt(scn.nextLine().trim());

        while(t-->0)
        {
            String[] s = scn.nextLine().toLowerCase(Locale.ROOT).split("\\W");
            for(String i:s)
            {
                if(!map.containsKey(i))
                {
                    map.put(i,1);
                }
                else
                {
                    map.put(i,map.get(i)+1);
                }
            }
        }


        ArrayList<Xau> list = new ArrayList<>();
        for(String s :map.keySet())
        {
            if(!s.equals(""))
            {
                Xau x = new Xau(map.get(s),s);
                list.add(x);
            }
        }

        Collections.sort(list);
        for(Xau x : list)
        {
            System.out.println(x.getS()+" "+x.getNum());
        }
    }
}
