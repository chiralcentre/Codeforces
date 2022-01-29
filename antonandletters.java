import java.util.*;

public class antonandletters {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String firstLine = s.nextLine().replace("{", " ").replace("}", " ").strip();
        if (firstLine.length() == 0){System.out.println(0);}
        else {
            String[] letters = firstLine.split(", ");
            Set<String> unique_letters = new HashSet<String>();
            for (String y: letters){unique_letters.add(y);}
            System.out.println(unique_letters.size());
        }
        s.close();
    }
}
