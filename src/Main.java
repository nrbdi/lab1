import java.util.Scanner;
//task1
//The time complexity of this code is O(n), where n is the number of elements in the array.

public class Main{
    public static int findMinimum(int[] arr) {
        int minimum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        return minimum;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i=0; i<n;i++){
            array[i]=scanner.nextInt();
        }

        System.out.println("minimum value:" + findMinimum(array));
        scanner.close();
    }
}
