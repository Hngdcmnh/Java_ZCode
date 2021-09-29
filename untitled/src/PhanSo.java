class PhanSo {
    private long tuso;
    private long mauso;

    PhanSo(long tuso, long mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }

    public void output() {
        long tuso = this.tuso;
        long mauso = this.mauso;
        while(tuso * mauso!=0)
        {
            if(tuso>mauso) tuso = tuso % mauso;
            else mauso = mauso % tuso;
        }
        long gcd = tuso +mauso;
        System.out.println((this.tuso/gcd) + "/" + (this.mauso/gcd));
    }


}
