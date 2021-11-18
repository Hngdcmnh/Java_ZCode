class HoaDon implements Comparable<HoaDon> {
    private String ma;
    private KhachHang khachHang;
    private MatHang matHang;
    private int soLuong;

    public HoaDon(int ma, KhachHang khachHang, MatHang matHang, int soLuong) {
        this.ma = "HD"+String.format("%03d",ma);
        this.khachHang = khachHang;
        this.matHang = matHang;
        this.soLuong = soLuong;
    }

    private long thanhTien()
    {
        return matHang.getGiaBan()*soLuong;
    }

    private long tienLai()
    {
        return (matHang.getGiaBan()- matHang.getGiaMua())*soLuong;
    }



    @Override
    public String toString()
    {
        return ma +" "+khachHang.toString()+" "
                + matHang.getTen()+" "
                + soLuong +" "+ thanhTien()+" "+tienLai();
    }

    @Override
    public int compareTo(HoaDon o) {
        if(this.tienLai()<o.tienLai()) return 1;
        else if(this.tienLai()>o.tienLai()) return -1;
        else
        {
            if(this.ma.compareTo(o.ma)>0) return 1;
            else if(this.ma.compareTo(o.ma)<0) return -1;
            else return 0;
        }
    }
}
