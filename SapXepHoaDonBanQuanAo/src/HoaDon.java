class HoaDon implements Comparable<HoaDon>{
    private String ma;
    private String tenSanPham;
    private long soLuong;
    private long gia;

    public HoaDon(int stt,String maSP, String tenSanPham,long gia,
                  long soLuong) {
        this.ma = maSP+"-"+String.format("%03d",stt);
        this.tenSanPham = tenSanPham;
        this.gia = gia;
        this.soLuong = soLuong;

    }

    private long getTongTienPhaiTra()
    {
        return gia*soLuong;
    }

    private long getTienGiamGia()
    {
        if(soLuong>=150)
        {
            return getTongTienPhaiTra()/2;
        }
        else if(soLuong>=100)
        {
            return getTongTienPhaiTra()*30/100;
        }
        else if(soLuong>=50)
        {
            return getTongTienPhaiTra()*15/100;
        }
        else
        {
            return 0;
        }

    }

    private long getTienPhaiTra()
    {
        return getTongTienPhaiTra() - getTienGiamGia();
    }


    @Override
    public String toString()
    {
        return ma+" "+ tenSanPham+ " "+ getTienGiamGia()+" "+ getTienPhaiTra();
    }

    @Override
    public int compareTo(HoaDon o) {
        if(this.getTienPhaiTra()>o.getTienPhaiTra()) return -1;
        else if(this.getTienPhaiTra()<o.getTienPhaiTra()) return 1;
        else return 0;
    }
}
