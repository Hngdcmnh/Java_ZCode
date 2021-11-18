public class Main {
    private Test a;

    public static void main(String[] args)
    {
        a.get();
    }
}

class x implements Test {

    @Override
    public String get() {
        return null;
    }
}
