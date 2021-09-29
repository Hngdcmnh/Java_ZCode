import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class SinhVien {
    private String name;
    private String codeStudent;
    private String className;
    private String dob;
    private float gpa;

    SinhVien() throws ParseException
    {
        this.name ="";
        this.className = "";
        this.codeStudent="B20DCCN001";
        this.dob="";
        this.gpa = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDob() {
//        System.out.println(this.dob.toString());
        return this.dob;
    }

    public void setDob(String dob) throws ParseException {

//        System.out.println(dob + new SimpleDateFormat("dd/MM/YYYY").parse(dob));
//        this.dob = new SimpleDateFormat("dd/MM/YYYY").parse("02/02/2002");
        this.dob = dob;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getCodeStudent() {
        return codeStudent;
    }
}
