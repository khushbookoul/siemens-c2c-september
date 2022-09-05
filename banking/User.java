package banking;

public class User {
    private String userName;
    private int userAge;
    private String userEmailId;
    private BankAccount userBankAccount;

    public BankAccount getUserBankAccount() {
        return this.userBankAccount;
    }

    public void setUserBankAccount(BankAccount userBankAccount) {
        this.userBankAccount = userBankAccount;
    }


    public User(String userName, int userAge, String userEmailId) {
        this.userName = userName;
        this.userAge = userAge;
        this.userEmailId = userEmailId;
    }


    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return this.userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserEmailId() {
        return this.userEmailId;
    }

    public void setUserEmailId(String userEmailId) {
        this.userEmailId = userEmailId;
    }



    @Override
    public String toString() {
        return "{" +
            " userName='" + getUserName() + "'" +
            ", userAge='" + getUserAge() + "'" +
            ", userEmailId='" + getUserEmailId() + "'" +
            "}";
    }

}
