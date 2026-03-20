import java.util.Scanner;

public class Problem_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input String: ");
        String text = sc.next();
        char[] str = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            str[i] = text.charAt(i);
        }
        int start = 0;
        int end = str.length;
        permutation(str,start,end);
    }
    public static void permutation(char[] str, int start, int end) {
        if (start == end) {
            System.out.println(str);
            return;
        }
        for (int i = start; i < end; i++) {
            str = swap(str, start, i);
            permutation(str,start + 1, end);
            str = swap(str, i, start);
        }
    }
    public static char[] swap(char[] str, int first_elem, int second_elem) {
        char temp_letter = str[first_elem];
        str[first_elem] = str[second_elem];
        str[second_elem] = temp_letter;
        return str;
    }
}
