class SinhVien {
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

    public String getClassName() {
        return className;
    }
}
