import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = 1;
        ArrayList<GiaoVien> list = new ArrayList<>();
        int demHT=0;
        int demHP=0;
        while(t-->0)
        {
            GiaoVien gv = new GiaoVien(scn.nextLine().trim(),scn.nextLine().trim(),Long.parseLong(scn.nextLine().trim()));

            if(gv.getChucVu().equals("HT"))
            {
                demHT+=1;
                if(demHT>1) continue;
            }
            else if(gv.getChucVu().equals("HP"))
            {
                demHP+=1;
                if(demHP>2) continue;
            }

            list.add(gv);
        }

        for(GiaoVien gv : list)
        {
            System.out.println(gv.toString());
        }
    }
}

