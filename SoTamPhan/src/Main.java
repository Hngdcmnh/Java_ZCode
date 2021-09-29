import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while(t-->0)
        {
            int check=0;
            String s = scn.nextLine().trim();
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)!='1'&&s.charAt(i)!='2'&&s.charAt(i)!='0')
                {
                    System.out.println("NO");
                    check=1;
                    break;
                }
            }
            if(check==0)
            {
                System.out.println("YES");
            }
        }
    }

}
