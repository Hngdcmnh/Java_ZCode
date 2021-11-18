class DoanhNghiep implements Comparable<DoanhNghiep> {
    private String ma;
    private String ten;
    private long soLuong;
    private long soLuongDaNhan;

    public DoanhNghiep() {
    }

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

    public void setSoLuongDaNhan(long soLuongDaNhan) {
        this.soLuongDaNhan = soLuongDaNhan;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public long getSoLuong() {
        return soLuong;
    }

    public long getSoLuongDaNhan() {
        return soLuongDaNhan;
    }
}
