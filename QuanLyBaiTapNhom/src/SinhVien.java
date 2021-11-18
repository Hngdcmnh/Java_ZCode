public class SinhVien {
    private String id;
    private String name;
    private String phone;
    private int projectNum;
    private String project;

    public SinhVien(String id, String name, String phone, int projectNum) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.projectNum = projectNum;
    }

    @Override
    public String toString()
    {
        return id+" "+name+" "+ phone;
    }

    public int getProjectNum() {
        return projectNum;
    }
}
