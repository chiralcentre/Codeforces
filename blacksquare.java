import java.util.Scanner;

public class blacksquare {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String[] firstLine = s.nextLine().split(" "); int[] nums = new int[4];
        for (int i = 0; i < 4; i++) {nums[i] = Integer.parseInt(firstLine[i]);}
        String strip = s.nextLine().strip(); int score = 0;
        for (int j = 0; j < strip.length(); j++) {score += nums[Character.getNumericValue(strip.charAt(j))-1];}
        System.out.println(score);
        s.close();
    }
}
