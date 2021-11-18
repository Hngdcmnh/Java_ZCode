import java.util.ArrayList;

public class SinhVien implements Comparable<SinhVien>{
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
        return id+" "+name+" "+ phone+" "+projectNum+" "+project;
    }

    public int getProjectNum() {
        return projectNum;
    }

    public String getId() {
        return id;
    }

    public void setProject(ArrayList<String> listpj) {
        this.project = listpj.get(projectNum);
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.id.compareTo(o.id)>0) return 1;
        else if(this.id.compareTo(o.id)<0) return -1;
        else
        {
            return 0;
        }


    }
}
