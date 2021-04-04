import java.util.*;

public class accountBalance {

    public static final double INT_MAX = 100;

    public static void balanceWithdraw(double value) throws notEnoughBalance{
        if(value > INT_MAX) {
            throw new notEnoughBalance();
        }
    }

}