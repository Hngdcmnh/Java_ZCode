import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scn = new Scanner(System.in);
        SinhVien sv1 = new SinhVien();
        sv1.setName(scn.nextLine().trim());
        sv1.setClassName(scn.nextLine().trim());
        sv1.setDob(scn.nextLine().trim());
        sv1.setGpa(scn.nextFloat());

        System.out.print(sv1.getCodeStudent() + " " + sv1.getName() + " " + sv1.getClassName()+" "+ new SimpleDateFormat("dd/MM/yyyy").format(new SimpleDateFormat("dd/MM/yyyy").parse(sv1.getDob()))+" ");
        System.out.printf("%.2f",sv1.getGpa());
    }
}
