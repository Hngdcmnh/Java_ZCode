
class NhanVien {
    private int id=0;
    private String fullId;
    private String name;
    private int netSalary;
    private int workDay;
    private String position;

    public NhanVien( String name, int netSalary, int workDay, String position) {
        id = Main.id;
        Main.id+=1;
        this.fullId = "NV0" + String.valueOf(this.id);
        this.name = name;
        this.netSalary = netSalary;
        this.workDay = workDay;
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBonus()
    {
        if(this.position.equals( "GD"))
        {
            return 250000;
        }
        else if(this.position.equals("PGD"))
        {
            return 200000;
        }
        else if(this.position.equals("TP"))
        {
            return 180000;
        }
        else if(this.position.equals("NV"))
        {
            return 150000;
        }
        else return 0;
    }

    public double getPercent()
    {
        if(this.workDay>=25)
        {
            return 0.2;
        }
        else if(this.workDay>=22)
        {
            return 0.1;
        }
        else
        {
            return 0;
        }
    }

    public int getLuong()
    {
        return this.netSalary*this.workDay;
    }

    public int getTienThuong()
    {
        return (int) (this.getLuong()*this.getPercent());
    }

    public int getThuNhap()
    {
        int res =0;
        res = (int)(this.getLuong()+this.getTienThuong()+this.getBonus());
        return res;
    }

    public String getFullId() {
        return fullId;
    }

    public void setFullId(String fullId) {
        this.fullId = fullId;
    }

    public int getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(int salary) {
        this.netSalary = salary;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
}
