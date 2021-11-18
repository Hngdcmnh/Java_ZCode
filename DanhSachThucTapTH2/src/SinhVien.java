import java.util.StringTokenizer;

class SinhVien implements Comparable<SinhVien>,Cloneable {
    private String maSV;
    private String ten;
    private String lop;
    private String mail;

    public SinhVien() {
    }

    public SinhVien(String maSV, String ten, String lop, String mail) {
        this.maSV = maSV;
        this.ten = chuanHoa(ten);
        this.lop = lop;
        this.mail = mail;
    }

    private String chuanHoa(String ten) {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(ten);
        while(st.hasMoreTokens())
        {

            String x = st.nextToken();
            sb.append(Character.toUpperCase(x.charAt(0)));
            for(int i=1;i<x.length();i++)
            {
                sb.append(Character.toLowerCase(x.charAt(i)));
            }
            sb.append(" ");
        }
        return sb.toString();
    }

    @Override
    public String toString()
    {
        return maSV + " "+ ten+" "+ lop;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.maSV.compareTo(o.maSV);
    }

    public String getMaSV() {
        return maSV;
    }

    public String getTen() {
        return ten;
    }

    public String getLop() {
        return lop;
    }

    public String getMail() {
        return mail;
    }
}
