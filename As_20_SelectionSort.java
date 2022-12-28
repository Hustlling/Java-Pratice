package College_Programs;
import java.util.Arrays;
import java.util.Scanner;
public class As_20_SelectionSort {
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i;
            for (int j = i + 1; j < (arr.length); j++) {
                if (arr[smallest] > arr[j]) {
                        smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size = in.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the numbers : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        selectionSort(arr);
        System.out.println(" Sorted Array is : "+ Arrays.toString(arr) );
    }

}
