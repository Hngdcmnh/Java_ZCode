import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class KhachHang implements Cloneable {
    private String ma;
    private String ten;
    private String gioiTinh;
    private Date ngaySinh;
    private String diaChi;

    public KhachHang() {
    }

    public KhachHang(int ma, String ten, String gioiTinh, String ngaySinh, String diaChi) throws ParseException {
        this.ma = "KH"+String.format("%03d",ma);
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.diaChi = diaChi;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public  String toString()
    {
        return ten+" "+diaChi;
    }
}
