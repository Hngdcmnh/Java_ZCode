import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t= Integer.parseInt(scn.nextLine().trim());
        ArrayList<NhanVien> list = new ArrayList<>();
        int demGD=0,demTP=0,demPP=0;
        while(t-->0)
        {
            String s = scn.nextLine();
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(s);
            int dem=0;
            String id ="";
            String name="";
            while(st.hasMoreTokens())
            {
                if(dem==0) id = st.nextToken();
                else
                {
                    sb.append(st.nextToken()+" ");
                }
                dem++;
            }
            name = sb.toString();
            NhanVien nv = new NhanVien(id,name);
            if(nv.getChucVu().equals("GD"))
            {
                demGD+=1;
                if(demGD>1)
                {
                    nv.setChucVu("NV");
                }
            }
            else if(nv.getChucVu().equals("TP"))
            {
                demTP+=1;
                if(demTP>3)
                {
                    nv.setChucVu("NV");
                }
            }
            else if(nv.getChucVu().equals("PP"))
            {
                demPP+=1;
                if(demPP>3)
                {
                    nv.setChucVu("NV");
                }
            }

            list.add(nv);


        }
        Collections.sort(list);
        int t2 = Integer.parseInt(scn.nextLine().trim());
        while(t2-->0)
        {
            String chucVu =scn.nextLine().trim();
            for(NhanVien nv:  list)
            {
                if(nv.getChucVu().equals(chucVu))
                {
                    System.out.println(nv.toString());
                }
            }
            System.out.println("");
        }

    }
}
