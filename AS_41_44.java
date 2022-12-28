//41. Create a class Account with an instance variable balance (double). It should contain a
//        constructor that initializes the balance, ensure that the initial balance is greater than 0.0.
//        42. Create two methods namely credit and getBalance. The first one adds the amount (passed as
//        parameter) to balance and does not return any data. The second method allows clients (i.e. the
//        other classes that use this class) to obtain the value of a particular Account object’s balance.
//        43. Create class AccountTest to create and manipulate an Account object.
//        44. Write another method debit in the above program that withdraws money from an Account.
//        Ensure that the debit amount does not exceed the Account’s balance. In that case the balance
//        should be left unchanged and the method should print a message indicating “Debit amount
 //       exceeded account balance”. Modify class AccountTest to test method debit.
package College_Programs;
class account{
    private double balance;
    account(double balance){
        if(balance>0){
            this.balance=balance; }
    }
    public void credit(double add){
        this.balance=this.balance+add;
        System.out.println("amount credited to your account "+add);
        System.out.println("total balance is "+this.balance);
    }
    public double getBalance() {
        return balance;
    }
    public void debit (double sub){
        if(this.balance>sub && this.balance>0){
            this.balance=this.balance-sub;
            System.out.println("Balance is debited from account "+sub);
        } else{
            System.out.println("Balance is less amount in the account should not be 0");
        }
    }
}

public class AS_41_44 {
    public static void main(String[] args) {
        account a =new account(500);
        a.credit(200);
        a.debit(700);
    }
}
