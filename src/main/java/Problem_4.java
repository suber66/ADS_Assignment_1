import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = sc.nextInt();
        int factorial_number = factorial(number);
        System.out.println(factorial_number);
    }
    public static int factorial(int number) {
        if (number <= 1) {
            return 1;
        }
        return factorial(number-1) * number;
    }
}

