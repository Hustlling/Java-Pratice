// 8. Write an application Program to demonstrate your first object in java.


package College_Programs;
class firstobject{
    void print(){
        System.out.println("this is first object call to method");
    }
}
public class AS_8 {
    public static void main(String[] args) {
        firstobject fo = new firstobject();
        fo.print();
    }
}
