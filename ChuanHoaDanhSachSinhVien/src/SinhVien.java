import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class SinhVien {
    private String ten;
    private String maSV;
    private String lop;
    private Date sn;
    private Float GPA;

    public SinhVien(int STT, String ten, String lop, String sn, Float GPA) throws ParseException {
        this.ten = chuanHoa(ten);
        this.maSV = "B20DCCN" + String.format("%03d",STT);
        this.lop = lop;
        this.sn = new SimpleDateFormat("dd/MM/yyyy").parse(sn);
        this.GPA = GPA;
    }

    private String chuanHoa(String ten) {
        StringTokenizer st = new StringTokenizer(ten);
        StringBuilder res = new StringBuilder();
        while(st.hasMoreTokens())
        {
            String x = st.nextToken();
            res.append(Character.toUpperCase(x.charAt(0)));
            for(int i=1;i<x.length();i++)
            {
                res.append(Character.toLowerCase(x.charAt(i)));
            }
            res.append(" ");
        }
        return res.toString();
    }

    @Override
    public String toString()
    {
        return maSV + " "+ ten +" "+lop+" "+ new SimpleDateFormat("dd/MM/yyyy").format(sn) +" "+ String.format("%.2f",GPA);
    }
}
