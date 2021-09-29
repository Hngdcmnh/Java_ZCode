//import com.sun.source.util.SourcePositions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

class SinhVien implements Comparable<SinhVien> {
    private String id;
    private String name;
    private String idClass;
    private Date dob;
    private double GPA;

    public SinhVien() throws ParseException {
        this.id = "";
        this.name = "";
        this.idClass = "";
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse("1/1/1111");
        this.GPA = 0;
    }

//    public SinhVien(int n, String name, String idClass, String dob, double GPA) throws ParseException {
//        this.name = chuanHoa(name);
//        this.idClass = idClass;
////        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
//        this.GPA = GPA;
//        this.id = "B20DCCN"+String.format("%03d",n);
//    }

    private String chuanHoa(String name) {
        StringTokenizer st = new StringTokenizer(name);

        StringBuilder sb = new StringBuilder();

        while(st.hasMoreTokens())
        {
            String s = st.nextToken();
            sb.append(Character.toUpperCase(s.charAt(0)));
            for(int i=1;i<s.length();i++)
            {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    @Override
    public String toString()
    {
        String res = this.id+" "+this.name+" "+this.idClass+" "+new SimpleDateFormat("dd/MM/yyyy").format(this.dob)+" "+String.format("%.02f",this.GPA);
        return res;
    }

    public void setId(int n) {
        this.id = "B20DCCN"+String.format("%03d",n);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = chuanHoa(name);
    }

    public String getIdClass() {
        return idClass;
    }

    public void setIdClass(String idClass) {
        this.idClass = idClass;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(String dob) throws ParseException {
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.GPA>o.GPA) return -1;
        if(this.GPA<o.GPA) return 1;
        return 0;
    }
}
