import java.util.ArrayList;
import java.util.Scanner;

public class Problem_12 {
    private static int first_n_elements;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> elements = new ArrayList<>();
        System.out.println("Input number of element: ");
        int number_of_elements = sc.nextInt();
        System.out.println("Input elements: ");
        for(number_of_elements = number_of_elements ;number_of_elements > 0; number_of_elements--) {
            elements.add(sc.nextInt());
        }
        System.out.println("Input the number of first elements to sum: ");
        first_n_elements = sc.nextInt();
        System.out.println(sum_of_first_elements(0,elements));
    }
    public static int sum_of_first_elements(int n, ArrayList<Integer> elements) {
        if (n == first_n_elements) {
            return 0;
        }
        return elements.get(n) + sum_of_first_elements(n+1,elements);
    }
}
