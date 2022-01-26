import java.util.*;

public class carrotcakes {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), t = s.nextInt(), k = s.nextInt(), d = s.nextInt();
        System.out.println(((d+t)/t)* k < n?"YES":"NO"); // check if enough cakes are baked before second oven produces first batch
        s.close();
    }
}
