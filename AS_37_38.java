//37. Create a class called Employee that includes three pieces of information as instance
//        variables – a first name (type String), a last name (type String) and a monthly salary (double)
//        38. Create a constructor in above class to initialize the three instance variables. Provide a get
//        method for each instance variable.

package College_Programs;
class employee{
    String first_name;
    String last_name;
    double salary;
    employee(String a,String b ,double c){
        first_name=a;
        last_name=b;
        salary=c;
    }
    public String getFirst_name() {
        return first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public double getSalary() {
        return salary;
    }
}
public class AS_37_38 {
    public static void main(String[] args) {
        employee e=new employee("Sanyam ","Jain",100000);

        System.out.println(e.getFirst_name()+" "+e.getLast_name()+" " +" "+e.getSalary());
    }
}
