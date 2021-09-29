class PhanSo {
    private long tuSo;
    private long mauSo;

    PhanSo()
    {

    }

    PhanSo(long tuSo,long mauSo)
    {
        this.mauSo=mauSo;
        this.tuSo = tuSo;
    }

    public void rutGon()
    {
        long tuSo = this.tuSo;
        long mauSo = this.mauSo;
        while(tuSo*mauSo!=0)
        {
            if(tuSo>mauSo) tuSo = tuSo%mauSo;
            else mauSo = mauSo%tuSo;
        }

        this.tuSo = this.tuSo / (tuSo+mauSo);
        this.mauSo = this.mauSo/(tuSo+mauSo);
    }

    public PhanSo cong(PhanSo ps1)
    {
        PhanSo res = new PhanSo();
        res.tuSo = this.tuSo * ps1.mauSo + ps1.tuSo * this.mauSo;
        res.mauSo = this.mauSo * ps1.mauSo;
        res.rutGon();
        return res;
    }

    public long getTuSo() {
        return tuSo;
    }

    public void setTuSo(long tuSo) {
        this.tuSo = tuSo;
    }

    public long getMauSo() {
        return mauSo;
    }

    public void setMauSo(long mauSo) {
        this.mauSo = mauSo;
    }
}
