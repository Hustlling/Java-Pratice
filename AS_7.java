// 7. Write an application that evaluates the factorial of the integers from 1 to 5

package College_Programs;

class factorial{
    int fac(int n){
        if (n>0){
            return n*fac(n-1);
        }
        else{
            return 1;
        }
    }
}

public class AS_7 {
    public static void main(String[] args) {
        factorial f = new factorial();
        int result=f.fac(5);
        System.out.println(result);
    }
}





