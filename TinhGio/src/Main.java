import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        ArrayList<Person> list = new ArrayList<>();
        for(int i=1;i<=t;i++)
        {
            Person p = new Person();
            p.setId(scn.nextLine().trim());
            p.setName(scn.nextLine().trim());
            String in = scn.nextLine().trim();
            String out = scn.nextLine().trim();
            p.setTime(solveTime(in,out));

            list.add(p);

        }

        Collections.sort(list);
        for( Person p :list)
        {
            System.out.println(p.toString());
        }
    }

    private static long solveTime(String in, String out) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("hh:mm");
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();

        Date d1 = format.parse(in);
        Date d2 = format.parse(out);

        c1.setTime(d1);
        c2.setTime(d2);

        long time = (c2.getTime().getTime() - c1.getTime().getTime())/60/1000;
        return time;
    }
}

