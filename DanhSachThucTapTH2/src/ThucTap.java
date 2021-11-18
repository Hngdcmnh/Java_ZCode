class ThucTap {
    private DoanhNghiep doanhNghiep;
    private SinhVien sinhVien;

    public ThucTap( SinhVien sinhVien,DoanhNghiep doanhNghiep) {
        this.doanhNghiep = doanhNghiep;
        this.sinhVien = sinhVien;
    }

    public DoanhNghiep getDoanhNghiep() {
        return doanhNghiep;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }
}
