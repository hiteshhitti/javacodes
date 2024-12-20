import java.util.ArrayList;
public class account{
    String name;
    String account;
    double balance;

    public account(String name, String account, double balance){
        this.name=name;
        this.account=account;
        this.balance=balance;
    }

    public void deposit(double amount){
        this.balance+=amount;
    }

    public void withdraw(double amount){
        this.balance-=amount;
    }

    public String printinfo(){
        return "Name: " + name + ", Account Number: " + account + ", Balance: " + balance;
    }
}

public class Bank {


    public ArrayList<account> accounts;

    public Bank() {
        accounts = new ArrayList<account>();
    }

    public void addAccount(account account) {
        accounts.add(account);
    }

    public void removeAccount(account account) {
        accounts.remove(account);
    }

    public void depositMoney(account account, double amount) {
        account.deposit(amount);
    }

    public void withdrawMoney(account account, double amount) {
        account.withdraw(amount);
    }

    public ArrayList<account> getAccounts() {
        return accounts;
    }
}


public void main(String[] args) {
    Bank newbank = new Bank();
    account mukul = new account("mukul", "4512784512", 5500);
    account hitesh = new account("hitesh","45789696", 5000 );
    account raman = new account("raman", "74741414525285", 7500);
    newbank.addAccount(raman);
    newbank.addAccount(mukul);
    newbank.addAccount(hitesh);
    ArrayList<account> acc = newbank.getAccounts();
    for (account account: acc) {
        System.out.println(account.printinfo());
    }
    newbank.removeAccount(raman);
    System.out.println();
    for (account account: acc) {
        System.out.println(account.printinfo());
    }

    newbank.depositMoney(hitesh, 4700);
    System.out.println();
    for (account account: acc) {
        System.out.println(account.printinfo());
    }

}