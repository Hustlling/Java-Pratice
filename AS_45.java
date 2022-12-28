//45. Write an application that reads a five digit integer and determine whether it is a palindrome
//        (digit that reads the same backward and forward eg. 12321, 45554 etc.) . display an error message,
//        if the number is no5 five digits long and allow the user to enter a new value.


package College_Programs;
import java.util.Scanner;
public class AS_45 {
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter number");
        number= sc.nextInt();
        int value =number;
        int sum=0;
        while(value>0){
            int a =value%10;
            sum=sum*10+a;
            a=value/10;
            value=a;
        }
        if(number==sum) {
            System.out.println("yes it is a palindrome "+sum);
        }else {
            System.out.println("number is not palindrome "+sum);
        }
    }

}
