//6. Write an application that calculates the product of the odd integers from 1 to 15.

package College_Programs;
public class As_6 {
    public static void main(String[] args) {
        int pro=1;
        System.out.println("Odd Integers between 1 to 15 is : ");
        for(int i = 1;i<=15;i++){
            if (i%2!=0){
                System.out.print(i+" ");
                pro=pro*i;
            }
        }
        System.out.println("\nProduct of odd integers from 1 to 15 is : "+pro);
    }
}
