import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine().trim());
        ArrayList<GiaCuoc> listGiaCuoc = new ArrayList<>();
        while(t-->0)
        {
            GiaCuoc gc = new GiaCuoc(scn.nextLine().trim(),scn.nextLine().trim(),Long.parseLong(scn.nextLine().trim()));
            listGiaCuoc.add(gc);
        }

        int t2 =  Integer.parseInt(scn.nextLine().trim());
        while(t2-->0)
        {
            String s = scn.nextLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            String soThueBao="",khuVuc="",batDau,ketThuc;

            soThueBao = st.nextToken();
            batDau = st.nextToken();
            ketThuc = st.nextToken();

            if(soThueBao.charAt(0) == '0')
            {
                for(GiaCuoc kv : listGiaCuoc)
                {
                    if(soThueBao.substring(1,3).equals(kv.getMaVung()))
                    {
                        khuVuc = kv.getTen();
                        break;
                    }
                }
            }
            else
            {
                khuVuc = "Noi mang";
            }

            

        }
    }
}
