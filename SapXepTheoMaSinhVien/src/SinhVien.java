class SinhVien implements Comparable<SinhVien>{
    private String id;
    private String name;
    private String className;
    private String mail;

    public SinhVien(String id, String name, String className, String mail) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.mail = mail;
    }

    @Override
    public String toString()
    {
        return id+" "+name+" "+className+" "+mail;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.className.compareTo(o.className)<0) return -1;
        else if(this.className.compareTo(o.className)>0) return 1;
        else
        {
            if(this.id.compareTo(o.id)<0) return -1;
            else if(this.id.compareTo(o.id)>0) return 1;
            else return 0;
        }
    }
}
