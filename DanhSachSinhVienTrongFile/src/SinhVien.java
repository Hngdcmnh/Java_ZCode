import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class SinhVien {
    private String ten;
    private String lop;
    private Date ns;
    private float GPA;
    private String maSV;

    public SinhVien(int STT,String ten, String lop, String ns, float GPA) throws ParseException {
        this.maSV = "B20DCCN" + String.format("%03d",STT);
        this.ten = ten;
        this.lop = lop;
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
        this.GPA = GPA;
    }

    @Override
    public String toString()
    {
        return maSV + " "+ ten+" "+ lop+" "+ new SimpleDateFormat("dd/MM/yyyy").format(ns) +" "+ String.format("%.2f",GPA);
    }
}
