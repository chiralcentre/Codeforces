import java.util.Scanner;

public class dieroll {
    public static int gcd(int e, int f) {
        int rem; 
        while (f > 0) { 
          rem = e%f;
          e = f;
          f = rem;
        }
        return e;  
      }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int Y = s.nextInt(), W = s.nextInt(), highestPoints = Math.max(Y,W);
        int HCF = gcd(6-highestPoints+1,6), num = (6-highestPoints+1)/HCF, denom = 6/HCF;
        System.out.printf("%d/%d%n",num,denom);
        s.close();
    }
}
