class DoanhNghiep implements Comparable<DoanhNghiep> {
    private String ma;
    private String ten;
    private long soLuong;

    public DoanhNghiep(String ma, String ten, long soLuong) {
        this.ma = ma;
        this.ten = ten;
        this.soLuong = soLuong;
    }

    @Override
    public String toString()
    {
        return ma+" "+ ten+" "+ soLuong;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        return this.ma.compareTo(o.ma);
    }
}
