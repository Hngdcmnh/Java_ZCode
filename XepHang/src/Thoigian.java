public class Thoigian implements Comparable<Thoigian>{
    private int batdau;
    private int checkin;
    private int ketthuc;

    public Thoigian(int batdau, int checkin) {
        this.batdau = batdau;
        this.checkin = checkin;
        this.ketthuc = batdau+checkin;
    }

    @Override
    public int compareTo(Thoigian o) {
       if(this.batdau<o.batdau) return -1;
       else if(this.batdau>o.batdau) return 1;
       else return 0;
    }
}
