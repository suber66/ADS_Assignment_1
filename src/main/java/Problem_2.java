import java.util.ArrayList;
import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> elements = new ArrayList<>();
        System.out.println("Input number of element: ");
        int number_of_elements = sc.nextInt();
        System.out.println("Input elements: ");
        for(number_of_elements = number_of_elements ;number_of_elements > 0; number_of_elements--) {
            elements.add(sc.nextInt());
        }
        float avg = 0;
        for (int i = 0 ;i < elements.size(); i++) {
            avg += elements.get(i);
            }
        avg = avg / elements.size();
        System.out.println(avg);
        }
    }
