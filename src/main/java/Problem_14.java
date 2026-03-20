import java.util.Scanner;

public class Problem_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input base: ");
        int b = sc.nextInt();
        System.out.println("Input exponent: ");
        int n = sc.nextInt();
        System.out.println(sum_of_power(b,n));
    }
    public static int sum_of_power(int b, int n) {
        if (n == 0) {
            return 1;
        }
        return (int) (Math.pow(b,n) + sum_of_power(b,n-1));
    }
}
