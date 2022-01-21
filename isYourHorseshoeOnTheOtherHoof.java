import java.util.*;

public class isYourHorseshoeOnTheOtherHoof {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Set <Integer> colours = new HashSet <Integer> ();
        for (int i = 0; i < 4; i++){colours.add(s.nextInt());}
        System.out.println(4-colours.size()); // number of colours to buy = 4 - number of unique colours
        s.close();
    }
    
}
