public class Main {

    public static void main(String[] args) {
        BankAccountFacade bankAccountFacade = new BankAccountFacade("23423425" ,
                "941244");

        bankAccountFacade.welcomeUser();
        bankAccountFacade.withDrawMoney(500);
        bankAccountFacade.depositMoney(600);

    }
}
