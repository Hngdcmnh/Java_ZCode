class ThoiGian implements Comparable<ThoiGian> {
    private int gio;
    private int phut;
    private int giay;

    public ThoiGian(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public int toGiay()
    {
        return this.gio*3600+this.phut*60+this.giay;
    }

    @Override
    public String toString()
    {
        return Integer.toString(gio)+" "+Integer.toString(phut)+" "+Integer.toString(giay);
    }


    @Override
    public int compareTo(ThoiGian o) {
        if(this.toGiay()<o.toGiay()) return -1;
        else if(this.toGiay()>o.toGiay()) return 1;
        else return 0;
    }
}
