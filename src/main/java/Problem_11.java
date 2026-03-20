import java.util.Scanner;

public class Problem_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = sc.nextInt();
        System.out.println(sum_of_squares(n));
    }
    public static int sum_of_squares(int n) {
        if (n == 0) {
            return 0;
        }
        return (n*n) + sum_of_squares(n-1);
    }
}
