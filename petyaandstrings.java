import java.util.Scanner;

public class petyaandstrings {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String a = s.next().toLowerCase();
        String b = s.next().toLowerCase();
        // returns a negative value if a < b, 0 if a == b and a positive value if a > b 
        int n = a.compareTo(b);
        // print -1 if n < 0, 0 if n == 0 and 1 if n > 0
        System.out.println(n < 0 ? -1 : (n > 0 ? 1 : 0));
    }
}
