class DonHang {
    private String id;
    private String maSanPham;
    private long soLuong;
    private String tenSanPham;
    private long giaLoai1;
    private long giaLoai2;
    private String loaiSanPham;

    public DonHang(int id, String maSanPham, String tenSanPham,long soLuong, long giaLoai1, long giaLoai2) {

        this.id = maSanPham+"-"+String.format("%03d",id);
        this.loaiSanPham = maSanPham.substring(2,3);
        this.maSanPham = maSanPham;
        this.soLuong = soLuong;
        this.tenSanPham = tenSanPham;
        this.giaLoai1 = giaLoai1;
        this.giaLoai2 = giaLoai2;
    }

    public long getGia()
    {
        if(loaiSanPham.equals("1"))
        {
            return giaLoai1;
        }
        else if(loaiSanPham.equals("2"))
        {
            return giaLoai2;
        }
        else return 0;
    }

    public long getGiamGia()
    {
        if(soLuong>=150) return this.getGia()*50/100*soLuong;
        else if(soLuong>=100) return this.getGia()*30/100*soLuong;
        else if(soLuong>=50) return this.getGia()*15/100*soLuong;
        else return 0;
    }

    public long getTongSoTien()
    {
        return this.getGia()*this.soLuong - this.getGiamGia();
    }

    @Override
    public String toString()
    {
        return id +" "+tenSanPham+ " "+this.getGiamGia()+" "+this.getTongSoTien();
    }
}
