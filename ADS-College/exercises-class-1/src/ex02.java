import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many soldiers will Leonidas' 300 Spartans face?: ");
        int soldiers = scanner.nextInt();

        while (true) {
            if (soldiers < 10000) {
                System.out.println("Very little for a Spartan army! (try a higher number)");
            } else if (soldiers > 10000) {
                System.out.println("Retreat! (try a smaller number)");
            } else {
                System.out.println("This is Sparta! (you got it right)");
                break;
            }
            System.out.print("Try Again: ");
            soldiers = scanner.nextInt();
        }

        scanner.close();
    }
}
