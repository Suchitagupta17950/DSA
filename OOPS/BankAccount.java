package OOPS;

public class BankAccount {
    private String accountNumber;
    private String accountName;
    private double balance;

    BankAccount(String accountNumber,String accountName,double balance){
        this.accountNumber = accountNumber;
        this.accountName=accountName;
        this.balance=balance;

    }

    void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("balance" +amount);
        }
    }
    void withdrawl(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Remaining balance" +amount);
        }else{
            System.out.println("Insufficient balance");
        }
    }
    void displayBalance(){
        System.out.println("Current balance" +amount);
    }


}

public class main{
    public static void main(String[] args) {
        BankAccount account=new BankAccount("128765", "suchita", 800);

        account.deposit(40000);
        account.withdrawl(1000);
        account.displayBalance();
    }
}
