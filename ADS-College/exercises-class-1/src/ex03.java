import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<String>();
        System.out.print("enter the number of strings: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("enter a string: ");
            strings.add(scanner.next());
        }

        Collections.reverse(strings);
        System.out.println(strings);

        scanner.close();
    }
}
