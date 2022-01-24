import java.util.*;

public class juicer {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), b = s.nextInt(), d = s.nextInt(), squeezed = 0, discarded = 0;
        for (int i = 0; i < n; i++){
            int oranges = s.nextInt();
            if (oranges <= b) {squeezed += oranges;}
            if (squeezed > d) {discarded += 1; squeezed = 0;}
        }
        System.out.println(discarded);
        s.close();
    }
}
