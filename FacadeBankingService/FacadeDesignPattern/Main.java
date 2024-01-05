package FacadeDesignPattern;

public class Main {
    public static void main(String[] args) {
        BankService myBankService = new BankService();
        int mySaving = myBankService.createNewAcc("saving", 500);
        //int myInvest = myBankService.createNewAcc("invest", 1500);
//        System.out.println("Before Transaction");
//        System.out.println("Savings Amount: ",+myBankService.);
        //myBankService.transferMoney(mySaving,myInvest,1600);
        myBankService.withdrawMoney(mySaving, 550);

    }
}
