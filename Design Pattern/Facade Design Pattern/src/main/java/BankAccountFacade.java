public class BankAccountFacade {

    private CheckBalance checkBalance= null;
    private CheckSecurityKey checkSecurityKey = null;
    private CheckAccount checkAccount = null;
    private WelcomePage welcomePage = null;
    private String recentAccountNumber = null;
    private String recentSecurityKey = null;

    public BankAccountFacade(String recentAccountNumber , String recentSecurityKey) {
        this.recentAccountNumber = recentAccountNumber;
        this.recentSecurityKey = recentSecurityKey;
        checkAccount = new CheckAccount();
        checkBalance = new CheckBalance();
        checkSecurityKey = new CheckSecurityKey();
        welcomePage = new WelcomePage();
    }

    public void welcomeUser() {
        welcomePage.welcomeUser();
    }

    public void withDrawMoney(int amount) {
        if(checkAccount.checkValidAccount(recentAccountNumber) && checkSecurityKey.checkValidAccount(recentSecurityKey)
        && checkBalance.getBalance()>=amount) {
            if(checkBalance.checkValidAmount(amount)) {
                System.out.println("money is withdrawn from the account");
            }
            else {
                System.out.println("transaction hault due to some reason");
            }
        }
    }

    public void depositMoney(int amount) {
        this.checkBalance.depositCash(amount);
    }


}
