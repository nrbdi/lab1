import java.util.Scanner;

//task8
//in the function each element is checked once, so it is O(n)

public class Main {
    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isAllDigits(s, index + 1);
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String s = scanner.next();
        System.out.println(isAllDigits(s, 0));
        scanner.close();
    }
}
