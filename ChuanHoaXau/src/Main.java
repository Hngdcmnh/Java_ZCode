import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        while (scn.hasNextLine())
        {
            String s = scn.nextLine().trim();
//            if(s==null)
//            {
//                System.out.println("");
//            }
//            else
//            {
                StringTokenizer st = new StringTokenizer(s);
                int dem=0;
                String last="";
                ArrayList<String> list = new ArrayList<>();
                while (st.hasMoreTokens())
                {
                    StringBuilder sb = new StringBuilder();
                    String tmp = st.nextToken();
                    if(dem==0)
                    {
                        sb.append(Character.toUpperCase(tmp.charAt(0)));
                        for(int i=1;i<tmp.length();i++)
                        {
                            sb.append(Character.toLowerCase(tmp.charAt(i)));
                        }
                    }
                    else
                    {
                        for(int i=0;i<tmp.length();i++)
                        {
                            sb.append(Character.toLowerCase(tmp.charAt(i)));
                        }
                    }
                    last = sb.toString().substring(sb.length()-1);
                    dem++;
                    list.add(sb.toString());
                }

                for(int i=0;i<list.size()-1;i++)
                {
                    System.out.print(list.get(i)+" ");
                }

                if(list.get(list.size()-1).equals("?") || list.get(list.size()-1).equals("!") ||list.get(list.size()-1).equals(".") )
                {
                    System.out.print(list.get(list.size()-2));
                    System.out.println(list.get(list.size()-1));
                }
                else
                {
                    System.out.print(list.get(list.size()-2)+" ");
                    System.out.print(list.get(list.size()-1));
                    if(!last.equals("!")&&!last.equals(".")&&!last.equals("?"))
                    {
                        System.out.print(".");
                    }
                    System.out.println("");
                }
//            }
        }
    }
}



