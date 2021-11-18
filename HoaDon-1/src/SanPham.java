class SanPham {
    private String maSP;
    private String tenSP;
    private long gia1;
    private long gia2;

    public SanPham(String maSP, String tenSP, long gia1, long gia2) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia1 = gia1;
        this.gia2 = gia2;
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public long getGia1() {
        return gia1;
    }

    public long getGia2() {
        return gia2;
    }
}
