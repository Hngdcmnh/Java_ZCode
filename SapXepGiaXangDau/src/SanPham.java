class SanPham {
    private String maSanPham;
    private String tenSanPham;
    private long giaLoai1;
    private long giaLoai2;

    public SanPham(String maSanPham, String tenSanPham, long giaLoai1, long giaLoai2) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaLoai1 = giaLoai1;
        this.giaLoai2 = giaLoai2;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public long getGiaLoai1() {
        return giaLoai1;
    }

    public long getGiaLoai2() {
        return giaLoai2;
    }
}
