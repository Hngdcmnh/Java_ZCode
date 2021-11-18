class GiaCuoc {
    private String maVung;
    private String ten;
    private long giaCuoc;

    public GiaCuoc(String maVung, String ten, long giaCuoc) {
        this.maVung = maVung;
        this.ten = ten;
        this.giaCuoc = giaCuoc;
    }

    public long getGiaCuoc() {
        return giaCuoc;
    }

    public String getMaVung() {
        return maVung;
    }

    public String getTen() {
        return ten;
    }
}
