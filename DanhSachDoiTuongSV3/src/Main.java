import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine().trim());
        ArrayList<SinhVien> list = new ArrayList<>();
        for(int i =1;i<=t;i++)
        {
            SinhVien sv = new SinhVien();
            sv.setId(i);
            sv.setName(scn.nextLine().trim());
            sv.setIdClass(scn.nextLine().trim());
            sv.setDob(scn.nextLine().trim());
            sv.setGPA(Double.parseDouble(scn.nextLine()));

            list.add(sv);
        }

//        Collections.sort(list);
        for(SinhVien x : list)
        {
            System.out.println(x.toString());
        }


    }
}


