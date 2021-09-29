class NhanVien implements Comparable<NhanVien> {
    private String id;
    private String chucVu;
    private String heSoLuong;
    private String maNhanVien;
    private String ten;

    public NhanVien(String id, String ten) {
        this.id = id;
        this.chucVu = id.substring(0,2);
        this.heSoLuong = id.substring(2,4);
        this.maNhanVien = id.substring(4,7);
        this.ten = ten;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getChucVu() {
        return chucVu;
    }

    @Override
    public String toString()
    {
        return ten+ chucVu+" "+maNhanVien+" "+heSoLuong;
    }

    @Override
    public int compareTo(NhanVien o) {
        if(this.heSoLuong.compareTo(o.heSoLuong)>0) return -1;
        else if(this.heSoLuong.compareTo(o.heSoLuong)<0) return 1;
        else
        {
            if(this.maNhanVien.compareTo(o.maNhanVien)>0) return 1;
            else if(this.maNhanVien.compareTo(o.maNhanVien)<0) return -1;
            else return 0;
        }

    }
}
