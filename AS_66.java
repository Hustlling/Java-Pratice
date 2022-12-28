//66. Exception Handling program for division of two numbers that accepts numbers from user.

package College_Programs;
import java.util.Scanner;
public class AS_66 {
    public static void main(String[] args) {
        System.out.println("enter two numbers");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        try{
            System.out.println(a/b);
        }catch(Exception e) {
            System.out.println("Wrong input"+e);
        }
    }
}
