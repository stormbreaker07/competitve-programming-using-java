public class CheckAccount {

    private String accountNumber = "23423425";

    public String getAccountNumber() {
        return accountNumber;
    }

    public Boolean checkValidAccount(String accountNumber) {
        if(this.accountNumber.equals(accountNumber)) {
            System.out.println("valid account number");
            return true;
        } else {
            System.out.println("not valid account number");
            return false;
        }
    }
}
