class SinhVien {
    private String id;
    private String name;
    private String className;
    private String mail;

    public SinhVien(String id, String name, String className, String mail) {
        this.id = id;
        this.name = name;
        this.className = className;
        if(className.substring(0,1).equals("E") && ( id.substring(5,7).equals("CN") ||id.substring(5,7).equals("AT")) )
        {
            this.id  = "B16DCXX011";
        }
        this.mail = mail;
    }

    @Override
    public String toString()
    {
        return id+" "+name+" "+className+" "+mail;
    }

    public String getClassName() {
        return className;
    }

    public String getId() {
        return id;
    }
}
