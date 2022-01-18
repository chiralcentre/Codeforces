import java.util.Scanner;

public class nightatthemuseum {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String name = s.nextLine().strip();
        int rotations = 0, start = 0; // start from 'a'
        for (int i = 0; i < name.length(); i++){
            int letter = (int) name.charAt(i) - (int) 'a', offset = Math.abs(letter-start);
            rotations += Math.min(26 - offset, offset);
            start = letter;
        }
        System.out.println(rotations);
        s.close();
    }
}
