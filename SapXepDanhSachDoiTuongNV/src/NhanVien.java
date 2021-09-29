import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class NhanVien implements Comparable<NhanVien> {
    private String id;
    private String name;
    private String gender;
    private Date dob;
    private String address;
    private String tax;
    private Date dateContract;

    public NhanVien(int id, String name, String gender, String dob, String address, String tax, String dateContract) throws ParseException {
        this.id = String.format("%05d",id);
        this.name = name;
        this.gender = gender;
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        this.address = address;
        this.tax = tax;
        this.dateContract = new SimpleDateFormat("dd/MM/yyyy").parse(dateContract);
    }

    @Override
    public String toString()
    {
        String res =this.id+" "+this.name+" "+this.gender+" "+new SimpleDateFormat("dd/MM/yyyy").format(this.dob)+" "+this.address+" "+this.tax+" "+new SimpleDateFormat("dd/MM/yyyy").format(this.dateContract);
        return res;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public Date getDateContract() {
        return dateContract;
    }

    public void setDateContract(Date dateContract) {
        this.dateContract = dateContract;
    }

    @Override
    public int compareTo(NhanVien o) {
        if(this.dob.compareTo(o.dob)>0) return 1;
        else if(this.dob.compareTo(o.dob)<0) return -1;
        else return 0;
    }
}
