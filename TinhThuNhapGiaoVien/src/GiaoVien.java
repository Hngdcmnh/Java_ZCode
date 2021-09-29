class GiaoVien {
    private String id;
    private String chucVu;
    private int heSo;
    private String name;
    private long luong;

    public GiaoVien(String id, String name, long luong) {
        this.id =id;
        this.chucVu = id.substring(0,2);
        this.heSo = Integer.parseInt(id.substring(2,4));
        this.name = name;
        this.luong = luong;
    }

    public String getChucVu() {
        return chucVu;
    }

    public int getPhuCap()
    {
        if(this.chucVu.equals("HT"))
        {
            return 2000000;
        }
        else if(this.chucVu.equals("HP"))
        {
            return 900000;
        }
        else if(this.chucVu .equals("GV"))
        {
            return 500000;
        }
        else
        {
            return 0;
        }
    }

    public long getThuNhap()
    {
        return luong*this.heSo+this.getPhuCap();
    }

    @Override
    public String toString()
    {
        return id+" "+name+" "+ heSo+" "+ this.getPhuCap()+" "+this.getThuNhap() ;
    }
}
