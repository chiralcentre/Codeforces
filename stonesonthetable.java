import java.util.Scanner;

public class stonesonthetable {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine()),replacements = 0;
        String[] secondLine = s.nextLine().split("");
        String prev = secondLine[0];
        for (int i = 1; i < n; i++){
            String current = secondLine[i];
            if (prev.equals(current)){replacements++;}
            else {prev = current;}
        }
        System.out.println(replacements);
        s.close();
    }
}
