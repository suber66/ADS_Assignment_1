import java.util.Scanner;

public class Problem_8 {

    private static boolean is_not_digit = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type String: ");
        String s = sc.next();
        int number_of_elements = s.length();
       consist_of_digits(s,number_of_elements-1);
    }
    public static void consist_of_digits(String s, int number_of_elements) {
        if (number_of_elements < 0 || is_not_digit) {
            return;
        }
        String digits = "0123456789";
        if (!digits.contains(""+s.charAt(number_of_elements))) {
            System.out.println("No");
            is_not_digit = true;
        }
        consist_of_digits(s,number_of_elements - 1);
        if (!is_not_digit) {
            System.out.println("Yes");
            is_not_digit = true;
        }
    }
}
