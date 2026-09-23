class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message){
        super(message);

    }
}
class BankAccount {
    private double balance;

    BankAccount(double Balance){
        this.balance =balance;

    }

    void withdraw(double amount) throws InsufficientBalanceException{
        if (amount>balance){
            throw new InsufficientBalanceException("Insufficient balance!");

        }
        balance -= amount;
        System.out.println("Withdrawn: "+ amount +"Remaining:" +balance);
        }
}
public class BankDemo {
     public static void main(String[] args){
        BankAccount account =new BankAccount(1000);
        try {
            account.withdraw(500);
            account.withdraw(700);  

        }
        catch(InsufficientBalanceException e){
            System.out.println("Error:"  +e.getMessage());

        }finally {
            System.out.println("Transaction attempt finished.");

        }
     }
}
