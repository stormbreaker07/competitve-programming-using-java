public class CheckSecurityKey {

    private String securityKey = "941244";

    public String getAccountNumber() {
        return securityKey;
    }

    public Boolean checkValidAccount(String accountNumber) {
        if(this.securityKey.equals(securityKey)) {
            System.out.println("valid security key");
            return true;
        } else {
            System.out.println("not valid security key");
            return false;
        }
    }
}
