import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;
//D:\CODE_PRACTICE\ZCode-Java\LoaiBoSoNguyen\src\
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scn = new Scanner(new File("DATA.in"));
        ArrayList<String> list = new ArrayList<>();
        while(scn.hasNext())
        {
            String s = scn.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            while(st.hasMoreTokens())
            {
                String x = st.nextToken();
                if(check(x) || x.length()>=10)
                {
                    list.add(x);
                }
            }
        }

        Collections.sort(list);
        for( String str : list)
        {
            System.out.print(str+" ");
        }
    }

    private static boolean check(String x) {
        for(int i=0;i<x.length();i++)
        {
            if(Character.isDigit(x.charAt(i)))
            {
                return  false;
            }
        }
        return true;
    }
}
