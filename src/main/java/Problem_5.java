import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = sc.nextInt();
        int fib_number = Fibonacci(number);
        System.out.println(fib_number);
    }
    public static int Fibonacci(int number) {
        if (number == 0 || number == 1) {
            return number;
        }
        return Fibonacci(number - 1) + Fibonacci(number - 2);
    }
}
