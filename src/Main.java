import java.util.Scanner;
//task5
//fibonacci(n) call makes two recursive calls,
// leading to an exponential growth. it is O(2^n)


public class Main {
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(fibonacci(n));
        scanner.close();
    }
}


