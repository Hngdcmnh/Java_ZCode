import java.util.Date;

class NhanVien {
    private String name;
    private String id;
    private String gender;
    private Date dob;
    private String address;
    private String idTax;
    private Date dayContract;

    public NhanVien(String name, String gender, Date dob,String address, String idTax, Date dayContract) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.idTax = idTax;
        this.dayContract = dayContract;
        this.id = "00001";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getIdTax() {
        return idTax;
    }

    public void setIdTax(String idTax) {
        this.idTax = idTax;
    }

    public Date getDayContract() {
        return dayContract;
    }

    public void setDayContract(Date dayContract) {
        this.dayContract = dayContract;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
