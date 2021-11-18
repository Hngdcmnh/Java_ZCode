import java.io.*;
import java.util.*;

public class TH2Tong {

    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}

class WordSet {
    private ArrayList<String> list = new ArrayList<String>();
    private String content = "";

    WordSet(String s) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(s));
        HashSet<String> set = new HashSet<String>();
        while (sc.hasNext()) {
            String res = sc.nextLine();
            StringTokenizer st = new StringTokenizer(res);

            while (st.hasMoreTokens()) {
                String token1 = st.nextToken();
                StringBuilder token = new StringBuilder();
                for (int i = 0; i < token1.length(); i++) {
                    token.append(Character.toLowerCase(token1.charAt(i)));
                }

                if (!set.contains(token.toString())) {
                    list.add(token.toString());
                    set.add(token.toString());
                }

            }
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            content = content + list.get(i) + "\n";
        }
    }

    @Override
    public String toString() {
        return content;
    }
}