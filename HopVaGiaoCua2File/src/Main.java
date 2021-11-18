import java.io.IOException;
//D:\CODE_PRACTICE\ZCode-Java\HopVaGiaoCua2File\src\
public class Main {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
