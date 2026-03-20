import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean prime = true;
        System.out.println("Input a number: ");
        int number = sc.nextInt();
        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                prime = false;
            }
        }
        if (prime) {
            System.out.println("Prime");
        }
        else {
            System.out.println("Composite");
        }
    }
}
