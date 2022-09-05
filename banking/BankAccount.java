package banking;

public class BankAccount {
    private String bankAccountNumber;
    private String bankIfscCode;
    private String bankBranchName;
    private AccountType bankAccountType;
    private float bankAccountBalance;
    private AtmCard bankAccountAtmCard;


    public BankAccount(String bankAccountNumber, String bankIfscCode, String bankBranchName, AccountType bankAccountType, float bankAccountBalance) {
        this.bankAccountNumber = bankAccountNumber;
        this.bankIfscCode = bankIfscCode;
        this.bankBranchName = bankBranchName;
        this.bankAccountType = bankAccountType;
        this.bankAccountBalance = bankAccountBalance;
    }



    public float getBankAccountBalance() {
        return this.bankAccountBalance;
    }

    public void setBankAccountBalance(float bankAccountBalance) {
        this.bankAccountBalance = bankAccountBalance;
    }


    public String getBankAccountNumber() {
        return this.bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBankIfscCode() {
        return this.bankIfscCode;
    }

    public void setBankIfscCode(String bankIfscCode) {
        this.bankIfscCode = bankIfscCode;
    }

    public String getBankBranchName() {
        return this.bankBranchName;
    }

    public void setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
    }

    public AccountType getBankAccountType() {
        return this.bankAccountType;
    }

    public void setBankAccountType(AccountType bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    public AtmCard getBankAccountAtmCard() {
        return this.bankAccountAtmCard;
    }

    public void setBankAccountAtmCard(AtmCard bankAccountAtmCard) {
        this.bankAccountAtmCard = bankAccountAtmCard;
    }



    @Override
    public String toString() {
        return "{" +
            " bankAccountNumber='" + getBankAccountNumber() + "'" +
            ", bankIfscCode='" + getBankIfscCode() + "'" +
            ", bankBranchName='" + getBankBranchName() + "'" +
            ", bankAccountType='" + getBankAccountType() + "'" +
            ", bankAccountBalance='" + getBankAccountBalance() + "'" +
            ", bankAccountAtmCard='" + getBankAccountAtmCard() + "'" +
            "}";
    }
    

}