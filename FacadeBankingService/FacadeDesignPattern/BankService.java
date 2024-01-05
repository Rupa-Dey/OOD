package FacadeDesignPattern;

import java.util.Hashtable;

public class BankService {
    private Hashtable<Integer, IAccount> bankAcc;
     BankService(){
        this.bankAcc = new Hashtable<Integer,IAccount>();
    }
    public int createNewAcc(String type, int initAmt){
         IAccount newAcc = null;
         switch (type){
             case "chequing":
                 newAcc = new Chequing(initAmt);
                 break;
             case "invest":
                 newAcc = new InvestAccount(initAmt);
                 break;
             case "saving":
                 newAcc   = new SavingAccount(initAmt);
                 break;
             default:
                 System.out.println("invalid account type");
                 break;
         }
         if(newAcc!=null){
             this.bankAcc.put(newAcc.getAccountNumber(), newAcc);
             return newAcc.getAccountNumber();
         }
         return -1;
    }
    public void transferMoney(int to, int from, int amt){
         IAccount toAcc = this.bankAcc.get(to);
         IAccount fromAcc = this.bankAcc.get(from);
         fromAcc.transfer(toAcc,amt);
        //toAcc.withdraw(amt);
    }
    public void withdrawMoney(int fAcc, int amt){
         IAccount fromAcc = this.bankAcc.get(fAcc);
         fromAcc.withdraw(amt);
    }
}

