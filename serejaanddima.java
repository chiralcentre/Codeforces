import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

public class serejaanddima {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine()), k = 0, S = 0, D = 0; //k keeps track of whose turn it is
        String[] secondLine = s.nextLine().split(" ");
        s.close(); 
        Deque<Integer> nums = new ArrayDeque<Integer>();
        for (int i = 0; i < n; i++) {nums.add(Integer.parseInt(secondLine[i]));}
        // Sereja starts first, Dima starts second
        while (nums.size() > 0){
            if (nums.size() >= 2){
                int left = nums.peekFirst(), right = nums.peekLast();
                if (k%2 == 0) {S += left > right ? left : right;}
                else {D += left > right ? left : right;}
                if (left > right) {nums.removeFirst();}
                else {nums.removeLast();}
                }
            else if (nums.size() == 1){
                if (k%2 == 0) {S += nums.removeFirst();}
                else {D += nums.removeFirst();}
            }
            k += 1;
        }
        System.out.printf("%d %d%n",S,D);
    }
        
}
