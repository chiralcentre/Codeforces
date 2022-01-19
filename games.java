import java.util.Scanner;

public class games{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine()), games = 0;
        int[] home = new int[n], guest = new int[n];
        for (int i = 0; i < n; i++){
            String[] line = s.nextLine().split(" ");
            home[i] = Integer.parseInt(line[0]);
            guest[i] = Integer.parseInt(line[1]);
        }
        for (int j = 0; j < n; j++){
            for (int k = 0; k < n; k++){
                if (j == k) {continue;}
                if (home[j] == guest[k]) {games += 1;}
            }
        }
        System.out.println(games);
        s.close();
    }
}