import java.util.Scanner;

public class magnets {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int prev,current,groups;
        prev = current = groups = 0;
        for (int i = 0; i < n; i++){ //groups increase by 1 when consecutive integers are different
            current = s.nextInt();
            if (prev != current) groups++;
            prev = current;
        }
        System.out.println(groups);
    }
}
