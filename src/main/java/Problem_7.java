import java.util.Scanner;

public class Problem_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of elements: ");
        int number_of_elements = sc.nextInt();
        System.out.println("Input elements: ");
        reverse_order(number_of_elements,sc);
    }
    public static void reverse_order(int n,Scanner sc) {
        if (n == 0) {
            return;
        }
        int element = sc.nextInt();
        reverse_order(n-1,sc);
        System.out.print(element + " ");
    }
}
