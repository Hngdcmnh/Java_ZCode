import java.util.ArrayList;
import java.util.StringTokenizer;

class HocSinh implements Comparable<HocSinh> {
    String id;
    String name;
    double t,tv,nn,vl,hh,sh,ls,d,cd,cn;
    double diemTB;


    public HocSinh(int id,String name, String diem)
    {
        this.id ="HS"+ String.format("%02d",id);
        this.name = name;

        StringTokenizer st = new StringTokenizer(diem);
        diemTB=0;
        int dem=0;
        while(st.hasMoreTokens())
        {
            if(dem==0 || dem==1)
            {
                diemTB = (diemTB + Double.parseDouble(st.nextToken())*2);
            }
            else
            {
                diemTB = (diemTB + Double.parseDouble(st.nextToken()));
            }
            dem++;

        }
        diemTB = (double)(Math.round((diemTB/12)*10))/10;
    }

    public String getXepHang()
    {
        if(diemTB>=9) return "XUAT SAC";
        else if(diemTB>=8) return "GIOI";
        else if(diemTB>=7) return "KHA";
        else if(diemTB>=5.0) return "TB";
        else return "YEU";
    }

    @Override
    public String toString()
    {
        String s ="";
        s = id+" "+name+" "+diemTB+" "+this.getXepHang();
        return s;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public double getTv() {
        return tv;
    }

    public void setTv(double tv) {
        this.tv = tv;
    }

    public double getNn() {
        return nn;
    }

    public void setNn(double nn) {
        this.nn = nn;
    }

    public double getVl() {
        return vl;
    }

    public void setVl(double vl) {
        this.vl = vl;
    }

    public double getHh() {
        return hh;
    }

    public void setHh(double hh) {
        this.hh = hh;
    }

    public double getSh() {
        return sh;
    }

    public void setSh(double sh) {
        this.sh = sh;
    }

    public double getLs() {
        return ls;
    }

    public void setLs(double ls) {
        this.ls = ls;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getCd() {
        return cd;
    }

    public void setCd(double cd) {
        this.cd = cd;
    }

    public double getCn() {
        return cn;
    }

    public void setCn(double cn) {
        this.cn = cn;
    }


    @Override
    public int compareTo(HocSinh o) {
        if(this.diemTB>o.diemTB) return -1;
        else if(this.diemTB<o.diemTB)return 1;
        else
        {
            if(this.id.compareTo(o.id)>1) return 1;
            else if(this.id.compareTo(o.id)<1) return -1;
            return 0;
        }
    }
}
