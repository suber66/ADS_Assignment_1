import java.util.Scanner;

public class Problem_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = sc.nextInt();
        System.out.println("Input a power of number");
        int power = sc.nextInt();
        System.out.println(power_of_number(number,power));
    }
    public static int power_of_number(int number, int power) {
        if (power < 1) {
            return 1;
        }
        return power_of_number(number, power - 1) * number;
    }
}
