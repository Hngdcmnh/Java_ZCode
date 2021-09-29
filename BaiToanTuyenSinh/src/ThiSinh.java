class ThiSinh {
    private String name;
    private String id;
    private double t;
    private double l;
    private double h;

    public ThiSinh(String id, String name, double t, double l, double h) {
        this.name = name;
        this.id = id;
        this.t = t;
        this.l = l;
        this.h = h;
    }

    public void setT(double t) {
        this.t = t;
    }

    public void setL(double l) {
        this.l = l;
    }

    public void setH(double h) {
        this.h = h;
    }

    public String getKhuVuc()
    {
        String s = this.id.substring(0,3);
        return s;
    }

    public double getDiemUT()
    {
        if(this.getKhuVuc().equals("KV1"))
        {
            return 0.5;
        }
        else if(this.getKhuVuc().equals("KV2"))
        {
            return 1;
        }
        else
        {
            return 2.5;
        }
    }

    public double getDiem()
    {
        return this.h+this.t*2+this.l;
    }

    public String getStatus()
    {
        if(this.getDiem()+this.getDiemUT()>=24)
        {
            return "TRUNG TUYEN";
        }
        else
        {
            return "TRUOT";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
