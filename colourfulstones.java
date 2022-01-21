import java.util.Scanner;

public class colourfulstones {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String[] stones = s.nextLine().split(""), instructions = s.nextLine().split("");
        int start = 0;
        for (int j = 0; j < instructions.length; j++){
            if (instructions[j].equals(stones[start])){start += 1;}
        }
        System.out.println(start+1);
        s.close();
    }
}
