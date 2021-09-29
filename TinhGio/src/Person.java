
import java.time.format.DateTimeFormatter;
import java.util.logging.SimpleFormatter;

class Person implements Comparable<Person>{
    String id;
    String name;
    long time;

    public Person(String id, String name, long time) {
        this.id = id;
        this.name = name;
        this.time = time;
    }

    public Person() {
    }

    @Override
    public String toString()
    {
        return id+" "+name +" "+this.getTimePass();
    }

    public String getTimePass()
    {
//        if(time>=60)
//        {
            long hour = time/60;
            long minute = time - 60*(hour);

            return hour+" gio "+minute+" phut";
//        }
//        else
//        {
//            return Long.toString(time)+" phut";
//        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public int compareTo(Person o) {
        if(this.time>o.time) return -1;
        else if(this.time<o.time) return 1;
        else return 0;
    }
}