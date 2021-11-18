
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {

//        try
//        {
//            OutputStream os = new FileOutputStream("D:\\CODE_PRACTICE\\ZCode-Java\\SoKhacNhauTrongFile2\\src\\OUTPUT.bin");
//            String s = "12";
//            for(int i=0; i<s.length(); i++)
//                os.write(Integer.parseInt(s.charAt(i)+""));
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }


//            DataInputStream dis = new DataInputStream(new FileInputStream("DATA.IN"));
//            int a[] = new int[1000];
//            int i=0;
//            while(i<100000){
//                a[dis.readInt()]++;
//                i++;
//            }
//            dis.close();
//            i=0;
//            for(; i<1000; i++)
//                if(a[i]>0)
//                    System.out.println(i+" "+a[i]);
//        }

//    }
//
//        try {
        DataInputStream dis = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] a = new int[10000];
        for (int i = 0; i < 10000; i++) {
            a[i] = 0;
        }

        int x = 100000;
        while (x-- > 0) {
            a[dis.readInt()]++;
        }
        dis.close();

        for (int i = 0; i < 1000; i++) {
            if (a[i] > 0) {
                System.out.println(i + " " + a[i]);
            }
        }
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }


    }
}

