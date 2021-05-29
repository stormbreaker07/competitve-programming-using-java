public class CheckBalance {

    private int balance = 10000;

     public int getBalance() {
         return balance;
     }

     private void withdrawCash(int amount) {
         this.balance -= amount;

     }

     public void depositCash(int amount) {
         this.balance += amount;
     }

     public Boolean checkValidAmount(int amount) {
         if(amount <= this.balance) {
             withdrawCash(amount);
             return true;
         }
         else {
             return false;
         }
     }
}