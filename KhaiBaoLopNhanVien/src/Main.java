import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scn = new Scanner(System.in);
        NhanVien nv1 = new NhanVien(scn.nextLine().trim(),scn.nextLine().trim(),new SimpleDateFormat("dd/mm/yyyy").parse(scn.nextLine().trim()),scn.nextLine().trim(),scn.nextLine().trim(),new SimpleDateFormat("dd/mm/yyyy").parse(scn.nextLine().trim()));
        System.out.println(nv1.getId()+" "+ nv1.getName()+" "+nv1.getGender()+" "+new SimpleDateFormat("dd/mm/yyyy").format(nv1.getDob())+" "+nv1.getAddress()+" "+nv1.getIdTax()+" "+new SimpleDateFormat("dd/mm/yyyy").format(nv1.getDayContract()));
    }
}

