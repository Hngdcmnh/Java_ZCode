import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long tuso = scn.nextLong();
        long mauso = scn.nextLong();
        RutGonXauKiTu a = new RutGonXauKiTu(tuso, mauso);
        a.output();
    }
}
