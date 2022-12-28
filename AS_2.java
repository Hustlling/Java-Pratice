//2. State the order of evaluation of the operations in each of the following Java statements and
//        implement them to show the value of x after each statement.
//        (1) x = 7 + 3 * 6 / 2 – 1; (2) x = 2 % 2 + 2 * 2 – 2 / 2; (3) x = ( 3 * 9 * ( 3 + ( 9 * 3 / (3)
//        ) ) )

package College_Programs;
public class AS_2 {
    public static void main(String[] args) {
        int x1= 7+3*6/2-1;
        System.out.println(x1);
        int x2=  2%2+2*2-2/2;
        System.out.println(x2);
       int x3 = (3*9*(3+(9*3/(3))));
        System.out.println(x3);

    }

}
