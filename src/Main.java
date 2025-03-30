import java.util.Scanner;
//task3
//The function recursively checks divisibility up to √n, making it O(√n)

public class Main {
    public static boolean isPrime(int n, int i) {
        if (n<2) return false;
        if (i*i>n) return true;
        if (n % i == 0) return false;
        return isPrime(n, i+1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (isPrime(n, 2))
            System.out.println("Prime");
        else
            System.out.println("Composite");

        scanner.close();
    }
}
