import java.util.Scanner;
//task4
//The function makes n recursive calls, which makes it's time complexity O(n)


public class Main {
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(factorial(n));
        scanner.close();
    }
}
