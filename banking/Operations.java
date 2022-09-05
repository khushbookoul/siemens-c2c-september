package banking;

public class Operations {
    

 

    public static void depositAmountInAccount(BankAccount account, float amount){
        float newBalance = amount + account.getBankAccountBalance();
        account.setBankAccountBalance(newBalance);
    }


    public static void withdrawAmountFromAccount(BankAccount account, float amount){
        
        if(amount > account.getBankAccountBalance()){
            System.out.println("Insufficient Balance");
        }

        else{
            float newBalance = account.getBankAccountBalance() - amount;
            account.setBankAccountBalance(newBalance);
            System.out.println("Amount successfully debited!!!");
        }
    }

    public static void main(String[] args) {
        //making a user

        User u1 = new User("Harshit", 26, "harsdhhw@jfshkh.com");
        
        BankAccount b1 = new BankAccount("67678678686", "MUM-AXIS", 
        "Baner", AccountType.SAVING, 10000.00f);

        AtmCard ac1 = new AtmCard("77 7797 7676", "09/28", 123);


        //attachment between bankaccount and user

        u1.setUserBankAccount(b1);

        //attachment bank account and debit card
        b1.setBankAccountAtmCard(ac1);


        System.out.println("The current balance is: " + b1.getBankAccountBalance());

        withdrawAmountFromAccount(b1, 1000);


        depositAmountInAccount(b1, 5000);



    }
}
