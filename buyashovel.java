import java.util.*;

public class buyashovel {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String[] firstLine = s.nextLine().split(" ");
        int k = Integer.parseInt(firstLine[0]), r = Integer.parseInt(firstLine[1]), shovels = 1; // minimum number of shovels = 1
        while ((k*shovels - r)%10 != 0 && (k*shovels)%10 != 0){shovels += 1;}
        System.out.println(shovels);
        s.close();
    }
}
