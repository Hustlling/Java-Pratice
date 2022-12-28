//5. Write an application that declares two integers, determines whether the first is a multiple of
//        the second and print the result. [ Hint : Use the remainder operator.

package College_Programs;
import java.util.Scanner ;
public class AS_5 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = Input.nextInt();
        System.out.println("Enter the Second number");
        int b = Input.nextInt();
        if (a % b == 0) {
            System.out.println( a+" is multiple of " +b);
        } else {
            System.out.println(a+" is not multiple of " +b);

        }
    }
}

