import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
//D:\CODE_PRACTICE\ZCode-Java\ChuanHoaXauHoTenTrongFile\src\
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scn = new Scanner(new File("DATA.in"));
        while(scn.hasNext())
        {
            ArrayList<String> list = new ArrayList<>();
            String s = scn.nextLine().trim();
            if(s.equals("END"))
            {
                break;
            }
            StringTokenizer st = new StringTokenizer(s);
            while(st.hasMoreTokens())
            {
                String x = st.nextToken();
                StringBuilder sb = new StringBuilder();
                sb.append(Character.toUpperCase(x.charAt(0)));
                for(int i=1;i<x.length();i++)
                {
                    sb.append(Character.toLowerCase(x.charAt(i)));
                }

                list.add(sb.toString());
            }

            for(int i =0;i<list.size()-1;i++)
            {
                System.out.print(list.get(i)+" ");
            }


            System.out.println(list.get(list.size()-1)+"");


        }
    }
}
