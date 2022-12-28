//4. Write an application that declares 5 integers, calculates and print the average of these
//        numbers.

package College_Programs;
public class AS_4 {
    public static void main(String[] args) {
        int arr[]={40,20,30,70,10};
       float avg = 0;
       float sum=0;
        for(int i = 0 ; i<arr.length;i++) {
            sum= sum+arr[i];
        }
        avg = sum/ arr.length;

        System.out.println("Average Is :"+avg );

    }
}
