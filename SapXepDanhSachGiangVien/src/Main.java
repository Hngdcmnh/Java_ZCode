import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        ArrayList<GiangVien> list = new ArrayList<>();
        int t = Integer.parseInt(scn.nextLine().trim());
        for(int i=1;i<=t;i++)
        {
            list.add(new GiangVien(
                    i,
                    scn.nextLine().trim(),
                    scn.nextLine().trim()
            ));
        }

        Collections.sort(list);
        for(GiangVien gv : list)
        {
            System.out.println(gv.toString());
        }
    }

}

class GiangVien implements  Comparable<GiangVien>{
    private String ma;
    private String hoTen;
    private String boMon;
    private String ten;


    public GiangVien(int stt,String hoTen, String boMon) {
        this.ma = "GV"+String.format("%02d",stt);
        this.hoTen = hoTen;
        this.boMon = boMon;
        String[] tenX = hoTen.split("\\s+");
        this.ten = tenX[tenX.length-1];
    }

    @Override
    public String toString()
    {
        String[] boMonX = boMon.toUpperCase(Locale.ROOT).split("\\s+");
        StringBuilder bm = new StringBuilder();
        for(String s : boMonX)
        {
            bm.append(s.charAt(0));
        }
        return ma+" " + hoTen + " "+bm.toString();

    }

    @Override
    public int compareTo(GiangVien o) {
        if(this.ten.equals(o.ten))
        {
            return ma.compareTo(o.ma);
        }
        else
        {
            return ten.compareTo(o.ten);
        }
    }
}
