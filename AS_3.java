//Write an application that declares 5 integers, determines and prints the largest and smallest in
//        the group

package College_Programs;
public class AS_3 {
    public static void main(String[] args) {
        int arr[]={40,20,30,70,10};
        float largest=arr[0];
        float smallest=arr[0];
        for(int i = 0 ; i<arr.length;i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
                for(int j = 0 ; j<arr.length;j++) {
                    if (arr[j] < largest) {
                        smallest = arr[j];
                    }
                }
        System.out.println("Smallest Number:"+largest);
        System.out.println("Largest Number:"+smallest);

    }
}
