import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weigth: ");
        int weight = scanner.nextInt();
        System.out.print("Enter your height: ");
        double height = scanner.nextDouble();
        double imc = weight / (height * height);
        System.out.printf("Your IMC is: %.2f", imc);
        scanner.close();
    }
}
