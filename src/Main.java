import java.util.Scanner;

//task9
//exponential O(2ⁿ) since it branches into two recursive calls.

public class Main {
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) return 1;
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.println(binomialCoefficient(n, k));
        scanner.close();
    }
}

