//39. Write a test application named EmployeeTest that demonstrates class Employee’s capabilities.
//        Create two employee objects and display each object’s yearly salary.
//        40. Give each employee a 10% raise and display each Employee’s yearly salary again.
 package College_Programs;
class employeetest{
    String name;
    double salary;
    employeetest(String n,double s){
        name=n;
        salary=s;
    }
    public String getName() {
        return name;
    }
    //increase in salary
    public double getSalary() {
        return salary+(salary*10/100);
    }
}
public class AS_39_40 {
    public static void main(String[] args) {
        employeetest e1,e2;
        e1=new employeetest("Sanyam",100000);
        e2=new employeetest("Sourabh",500000);
        System.out.println(e1.getSalary());
        System.out.println(e2.getSalary());
    }
}