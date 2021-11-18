class SanPham {
    private String ma;
    private String ten;
    private long gia1;
    private long gia2;

    public SanPham(String ma, String ten, long gia1, long gia2) {
        this.ma = ma;
        this.ten = ten;
        this.gia1 = gia1;
        this.gia2 = gia2;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public long getGia1() {
        return gia1;
    }

    public long getGia2() {
        return gia2;
    }
}
