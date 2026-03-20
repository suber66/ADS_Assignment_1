import java.util.Scanner;

public class Problem_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = sc.nextInt();
        System.out.println("Input k: ");
        int k = sc.nextInt();
        System.out.println(binomial_coefficient(n,k));
    }
    public static int binomial_coefficient(int n, int k) {
        if (k == 0 || n == k) {
            return 1;
        }
        return binomial_coefficient(n-1,k-1) + binomial_coefficient(n-1,k);
    }
}
