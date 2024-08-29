 public class Main {
    public static void main(String[] args) {
        //makes a new account called account with id of 1122 and balance off 20,000
        Account account = new Account(1122, 20000.00);
        //Sets the annual interest rate at 4.5
        account.setAnnualInterestRate(4.5);
        //withdraws 2,500
        account.withdraw(2500);
        //deposits 3,000
        account.deposit(3000);
        //prints balance, the monthly interest, and the date when the account was created
        System.out.println("Account Balance: " + account.getBalance() + "\nMonthly Interest: " + account.getMonthlyInterest() + "\nDate of Account Creation:" + account.getDateCreated());
    }
}