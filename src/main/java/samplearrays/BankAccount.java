package samplearrays;

public class BankAccount {

    String name;
    double currentBalance;
    double[] transactions = new double[1000];
    int i = 0;
    //TO-DO: Initialize an Array with 1000 in size that stores Double called 'transactions' to keep track of the user's transactions

    public BankAccount(String name, int startingBalance){
        this.name = name;
        this.currentBalance = startingBalance;

    }

    public void deposit(double amount){
        if (amount<0){
            System.out.println("Amount is not valid");
        }
        else{
            if (i<1000){
                transactions[i] = amount;
                i++;
                System.out.println("======================================================");
                System.out.println("Depositor name: "+ name);
                System.out.println("Amount: "+ amount);
                System.out.println("Balance: "+ currentBalance);
                System.out.println("======================================================");
            }
            else{
                System.out.println("Contact your Bank agency for more transactions.");
            }
        }

    }

    public void withdraw(double amount){
        if (amount<0 || currentBalance<amount){
            System.out.println("Amount is not valid");
        }
        else{
            if (i<1000){
                transactions[i] = -amount;
                i++;
                System.out.println("======================================================");
                System.out.println("withdrawal name: "+ name);
                System.out.println("Amount: "+ amount);
                System.out.println("Balance: "+ currentBalance);
                System.out.println("======================================================");
            }
            else{
                System.out.println("Contact your Bank agency for more transactions.");
            }
        }

    }

    public void displayTransactions(){
        System.out.println("======================================================");
        System.out.print("Your Transactions:  ");
        for (int j = 0;j<transactions.length;j++){
            if (transactions[j] !=0){
                System.out.print(transactions[j]+"   ");
            }
            else{
                break;
            }
        }

        System.out.println();
        System.out.println("======================================================");

    }

    public void displayBalance(){
        System.out.println("======================================================");
        System.out.println("Your balance: "+currentBalance);
        System.out.println("======================================================");

    }

    public static void main(String[] args) {

        BankAccount john = new BankAccount("John Doe", 100);

        // ----- DO NOT CHANGE -----

        //Testing..
        john.displayBalance();
        john.deposit(0.25);
        john.withdraw(100.50);
        john.withdraw(40.90);
        john.deposit(-90.55);
        john.deposit(3000);
        john.displayTransactions();
        john.displayBalance();

        // ----- DO NOT CHANGE -----

    }

}

