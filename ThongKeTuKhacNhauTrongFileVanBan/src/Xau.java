class Xau implements Comparable<Xau> {
    private int num;
    private String s;

    public Xau(int num, String s) {
        this.num = num;
        this.s = s;
    }

    public int getNum() {
        return num;
    }

    public String getS() {
        return s;
    }

    @Override
    public int compareTo(Xau o) {
        if(this.num<o.num)
        {
            return 1;
        }
        else if(this.num>o.num)
        {
            return -1;
        }
        else
        {
            if(this.s.compareTo(o.s)<0)
            {
                return -1;
            }
            else if(this.s.compareTo(o.s)>0)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
    }
//        if (this.num == o.num)
//            return this.s.compareTo(o.s);
//        return o.num - this.num;
}
