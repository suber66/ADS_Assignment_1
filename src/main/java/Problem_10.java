import java.util.Scanner;

public class Problem_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = sc.nextInt();
        System.out.println("Input k: ");
        int k = sc.nextInt();
        System.out.println(Greatest_Common_Division(n,k));
    }
    public static int Greatest_Common_Division(int a, int b) {
        int q = a / b;
        int r = a - (q * b);
        if (r == 0) {
            return b;
        }
        return Greatest_Common_Division(b,r);
    }
}
