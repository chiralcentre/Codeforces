import java.util.Scanner;

public class word {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.next();
        char[] word = s.toCharArray();
        String upper,lower;
        upper = lower = "";
        for (int i = 0; i < word.length; i++){
            if (Character.isUpperCase(word[i])){
                upper += word[i];
            }
            else{
                lower += word[i];
            }
        }
        System.out.println(upper.length() > lower.length() ? s.toUpperCase() : s.toLowerCase());
    }
}
