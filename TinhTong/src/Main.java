import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
//D:\CODE_PRACTICE\ZCode-Java\TinhTong\src\
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scn = new Scanner(new File("DATA.in"));
        ArrayList<Integer> listI = new ArrayList<>();
        long sum=0;
        while(scn.hasNext())
        {
            String s = scn.nextLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            while(st.hasMoreTokens())
            {
                String x = st.nextToken();
                if(x.length()>=10)
                {
                    continue;
                }
                else if(checkNum(x) && Long.parseLong(x)<= Integer.MAX_VALUE)
                {
                    sum +=Integer.parseInt(x);
//                    listI.add(Integer.parseInt(st.nextToken()));
                }
            }
        }

        System.out.println(sum);
    }

    private static boolean checkNum(String x) {
        for(int i=0;i<x.length();i++)
        {
            if(! Character.isDigit(x.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }
}
