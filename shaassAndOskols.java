import java.util.*;

public class shaassAndOskols {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        int[] birds = new int[n];
        String[] secondLine = s.nextLine().split(" ");
        for (int i = 0; i < n; i++){birds[i] = Integer.parseInt(secondLine[i]);}
        int m = Integer.parseInt(s.nextLine());
        for (int j = 0; j < m; j++){
            int x = s.nextInt(), y = s.nextInt();
            if (x - 2 >= 0){birds[x-2] += y - 1;}
            if (x <= n - 1){birds[x] += birds[x-1] - y;}
            birds[x-1] = 0;
        }
        for (int k = 0; k < n; k++){System.out.println(birds[k]);}
        s.close();
    }
}
