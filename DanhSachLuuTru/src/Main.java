import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
//D:\CODE_PRACTICE\ZCode-Java\DanhSachLuuTru\src\
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner scn = new Scanner(new File("KHACH.in"));
        ArrayList<Khach> list =new ArrayList<>();
        int t = Integer.parseInt(scn.nextLine().trim());
        for(int i=1;i<=t;i++)
        {
            list.add(new Khach(
                    i,
                    scn.nextLine().trim(),
                    scn.nextLine().trim(),
                    scn.nextLine().trim(),
                    scn.nextLine().trim()
            ));
        }
        Collections.sort(list);

        for(Khach k :list)
        {
            System.out.println(k.toString());
        }


    }
}

class Khach implements Comparable<Khach>{
    private String ma;
    private String ten;
    private String maPhong;
    private Date ngayDen;
    private Date ngayDi;
    private long ngayLuuTru;

    public Khach(int ma, String ten, String maPhong, String ngayDen, String ngayDi) throws ParseException {
        this.ma = "KH"+ String.format("%02d",ma);
        this.ten = ten;
        this.maPhong = maPhong;
        this.ngayDen = new SimpleDateFormat("dd/MM/yyyy").parse(ngayDen);
        this.ngayDi = new SimpleDateFormat("dd/MM/yyyy").parse(ngayDi);
        this.ngayLuuTru =  this.ngayDi.getTime() - this.ngayDen.getTime();
    }


    @Override
    public String toString()
    {
        return ma+" "+ten+" "+maPhong+" "+String.valueOf(this.ngayLuuTru/24/60/60/1000);
    }


    @Override
    public int compareTo(Khach o) {
        return (int) (o.ngayLuuTru - this.ngayLuuTru);
    }
}
