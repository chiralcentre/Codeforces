import java.util.*;

public class eastereggs {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n =s.nextInt(), middle = 3;
        ArrayList<String> eggs = new ArrayList<String>(Arrays.asList("R","O","Y","G","B","I","V"));
        while (n > 7){
            eggs.add(eggs.get(middle));
            middle += 1;
            n -= 1;
        }
        for (String str: eggs){System.out.print(str);}
        s.close();
    }
}
