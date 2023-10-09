/*
Lab Assignment03--Write a Java program that demonstrate the
implementation of a facade design pattern for a Banking Service
with Checking, Saving, and Investment modules..
 */
//...........................................


package FacadeBankingService;

public class Main {
    public static void main(String[] args) {
     BankingService bankingService = new BankingService();
     bankingService.savingOperation();
     bankingService.checkingOperation();
     bankingService.investmentOperation();
    }
}
