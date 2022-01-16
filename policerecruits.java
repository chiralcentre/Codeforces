import java.util.Scanner;

public class policerecruits {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine()), officers = 0, untreated = 0;
        String[] secondLine = s.nextLine().split(" ");
        for (int i = 0; i < n; i++){
            int event = Integer.parseInt(secondLine[i]);
            if (event == -1) {
                if (officers >= 1) {officers -= 1;}
                else {untreated += 1;}
            }
            else {officers += event;}
        }
        System.out.println(untreated);
        s.close();
    }
}
