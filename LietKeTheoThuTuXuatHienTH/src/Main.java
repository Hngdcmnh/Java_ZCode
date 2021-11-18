
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.util.*;

public class Main {
        public static void main(String[] args) throws IOException, ParseException,ClassNotFoundException {
            Scanner scn= new Scanner(new File("VANBAN.in"));
            ObjectInputStream objInput = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
            ArrayList<String> listOfObjectInputStream = (ArrayList<String>) objInput.readObject();
            ArrayList<String> listOfScanner = new ArrayList<>();

            Set<String> combineWord = new HashSet<>();

            for (String string : listOfObjectInputStream) {
                String[] s = string.toLowerCase(Locale.ROOT).trim().split("\\s+");
                for (String word : s) {
                    if(!combineWord.contains(word))
                    {
                        combineWord.add(word);
                    }
                }
            }

            while(scn.hasNextLine())
            {
                String[] s = scn.nextLine().toLowerCase(Locale.ROOT).trim().split("\\s+");
                for (String string : s) {
                    if(combineWord.contains(string)) {
                        System.out.println(string.trim().toLowerCase(Locale.ROOT));
                        combineWord.remove(string);
                    }
                }
            }



        }
    }
