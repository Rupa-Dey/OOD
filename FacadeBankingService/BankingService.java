package FacadeBankingService;

import java.security.PrivateKey;

public class BankingService {
    private Checking checking;
    private Saving saving;
    private Investment investment;

    public BankingService(){
        checking = new Checking();
        saving = new Saving();
        investment = new Investment();
    }

    public void checkingOperation() {
        checking.operation();
    }

    public void savingOperation() {
        saving.operation();
    }
    public void investmentOperation() {
        investment.operation();
    }


}
