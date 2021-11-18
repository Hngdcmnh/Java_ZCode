class MatHang implements  Cloneable{
    private String ma;
    private String ten;
    private String donVi;
    private Long giaMua;
    private Long giaBan;

    public MatHang(int ma, String ten, String donVi, Long giaMua, Long giaBan) {
        this.ma = "MH"+String.format("%03d",ma);
        this.ten = ten;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public MatHang() {
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getDonVi() {
        return donVi;
    }

    public Long getGiaMua() {
        return giaMua;
    }

    public Long getGiaBan() {
        return giaBan;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public  String toString()
    {
        return ten+" "+donVi+" "+giaMua.toString()+" "+giaBan.toString();
    }
}
