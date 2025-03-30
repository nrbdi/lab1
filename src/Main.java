import java.util.Scanner;
//task6
//The function makes n recursive calls, reducing n by 1 each time, so it is O(n)

public class Main {
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.println(power(a, n));
        scanner.close();
    }
}


