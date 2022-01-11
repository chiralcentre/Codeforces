import java.util.Scanner;

public class boyorgirl {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String name = s.next();
        String temp = ""; //temp stores all unique characters
        int count = 0;
        for (int i = 0; i < name.length(); i++){
             // check for unique characters
            if (!temp.contains(String.valueOf(name.charAt(i)))){
                temp += name.charAt(i);
                count ++;
            }
        }
        System.out.println(count%2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");
    }
}
