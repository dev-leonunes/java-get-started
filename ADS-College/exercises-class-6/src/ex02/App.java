package ex02;

public class App {

    public static int[] Array(int n) {
        try {
            return new int[n];
        } catch (NegativeArraySizeException e) {
            System.out.println("Erro: " + e);
            return null;
        }
    }

    public static void main(String[] args) {
        int tam = 10;
        int arr[] = Array(tam);

        for (int i = 0; i < tam; i++) {
            System.out.println(arr[i]);
        }
    }
}
