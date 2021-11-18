import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scn = new Scanner(new File("D:\\CODE_PRACTICE\\ZCode-Java\\DocFileVanBan\\src\\DATA.txt"));
        while(scn.hasNext())
        {
            String s = scn.nextLine();
            System.out.println(s);
        }

    }
}


