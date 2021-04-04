import java.util.*;

public class notEnoughBalance extends Exception{

    public notEnoughBalance() {
        super("not enough money in account to withdraw");
    }


}