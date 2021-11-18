import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//
public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }

}

class LoaiPhong implements Comparable<LoaiPhong>{
    private Character kyHieu;
    private String ten;
    private long gia;
    private float phiDichVu;

    public LoaiPhong(String s) {
        String[] str = s.trim().split(" ");
        this.kyHieu = str[0].trim().charAt(0);
        this.ten =str[1].trim();
        this.gia = Long.parseLong(str[2].trim());
        this.phiDichVu = Float.parseFloat(str[3].trim());
    }

    public String getTen() {
        return ten;
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return this.ten.compareTo(o.ten);
    }

    @Override
    public String toString()
    {
        return kyHieu+" "+ ten+" "+gia+" "+phiDichVu;
    }
}
