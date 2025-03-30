import java.util.Scanner;
//task7
//in the function each element is read once and printed once, so it is O(n)

public class Main {
    public static void reversePrint(int index, int n, Scanner scanner) {
        if (index == n) return;
        int num = scanner.nextInt();
        reversePrint(index + 1, n, scanner);
        System.out.print(num + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        reversePrint(0, n, scanner);
        scanner.close();
    }
}

