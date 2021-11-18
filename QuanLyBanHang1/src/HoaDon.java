class HoaDon {
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

    

    @Override
    public String toString()
    {
        return ma +" "+khachHang.toString()+" "
                + matHang.toString()+" "
                + soLuong +" "+ thanhTien();
    }
}
