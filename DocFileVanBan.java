import java.io.*;
import java.util.*;

public class DocFileVanBan {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scn = new Scanner(new File("DATA.in"));
        while (scn.hasNext()) {
            String s = scn.nextLine();
            System.out.println(s);
        }

    }
}
