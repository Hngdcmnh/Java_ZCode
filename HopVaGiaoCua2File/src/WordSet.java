import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordSet {
    private ArrayList<String> list;

    public ArrayList<String> getList() {
        return list;
    }

    public WordSet(String path) throws FileNotFoundException {
        Scanner scn = new Scanner(new File(path));
        list = new ArrayList<>();
        while(scn.hasNext())
        {
            String s = scn.nextLine().toLowerCase(Locale.ROOT);
            StringTokenizer st = new StringTokenizer(s);
            while(st.hasMoreTokens())
            {
                list.add(st.nextToken());
            }
        }
    }

    public String union(WordSet w)
    {
        ArrayList<String> intersectionList = new ArrayList<>();
        for(String s : this.list)
        {
            if(!intersectionList.contains(s)) {
                intersectionList.add(s);
            }
        }

        for(String s : w.getList())
        {
            if(!intersectionList.contains(s))
            {
                intersectionList.add(s);
            }
        }

        Collections.sort(intersectionList);
        String res="";
        for(int i=0;i<intersectionList.size()-1;i++)
        {
            res = res + intersectionList.get(i)+" ";
        }
        res = res + intersectionList.get(intersectionList.size()-1);
        return res;

    }

    public String intersection(WordSet w)
    {
        ArrayList<String> unionList = new ArrayList<>();
        for(String s : this.list)
        {
            if(w.getList().contains(s) && !unionList.contains(s))
            {
                unionList.add(s);
            }
        }

        Collections.sort(unionList);

        String res="";
        for(int i=0;i<unionList.size()-1;i++)
        {
            res = res + unionList.get(i)+" ";
        }
        res = res + unionList.get(unionList.size()-1);
        return res;


    }


}
