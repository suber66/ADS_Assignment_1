import java.util.ArrayList;
import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> elements = new ArrayList<>();
        System.out.println("Input number of element: ");
        int number_of_elements = sc.nextInt();
        System.out.println("Input elements: ");
        for(number_of_elements = number_of_elements ;number_of_elements > 0; number_of_elements--) {
            elements.add(sc.nextInt());
        }
        int min = elements.getFirst();
        for (int i = 0 ;i < elements.size(); i++) {
            if (min > elements.get(i)) {
                min = elements.get(i);
            }
        }
        System.out.println(min);

    }
}
