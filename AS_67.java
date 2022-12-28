//67. Exception Handling program for storing values in array of int or String that results into buffer
//        overflow

package College_Programs;
import java.nio.BufferOverflowException;
import java.util.Scanner;
public class AS_67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int arr[]=new int[5];
            for(int i =0;i<20;i++) {
                arr[i]=i;
            }
        }catch(BufferOverflowException e){
            System.out.println("Input more than range");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }

}
