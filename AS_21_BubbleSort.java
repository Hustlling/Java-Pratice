// 21. WAP in java to implement Bubble Sort Algo.
package College_Programs;
import java.util.Arrays;
import java.util.Scanner;

class BubbleSort{
    static void bubbleSort(int[] arr) {
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++) {
                if (arr[j] < arr[j - 1]) {
                    //swap elements
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
//            if(!swapped)
//                System.out.println("Array is sorted after " + arr[i]);
//                break;
        }

    }
}
public class AS_21_BubbleSort {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size = in.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the numbers : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        BubbleSort b1 = new BubbleSort();
        b1.bubbleSort(arr);
        System.out.println(" Sorted Array is : "+ Arrays.toString(arr) );


    }
}

