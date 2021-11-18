import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class WordSet {
    private Set<String> set = new TreeSet<>();

    WordSet(String path) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(path));
        while (sc.hasNext()) {
            String s = sc.nextLine().trim().toLowerCase(Locale.ROOT);
            StringTokenizer st = new StringTokenizer(s);
            while(st.hasMoreTokens())
            {
                set.add(st.nextToken());
            }
        }
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for(String x : set)
        {
            sb.append(x+"\n");
        }
        return sb.toString();
    }
}
