package FacadeDesignPattern;

public class SavingAccount implements IAccount{
        private int balance;
        private int AccNumber;
    public SavingAccount(int initAmt) {
            this.balance = initAmt;
        }
        public void deposit(int amt){
            this.balance+= amt;
        }

        @Override
        public void withdraw(int amt) {
            if(amt>this.balance){
                System.out.println("Insufficient balance");
                return;
            }
            else {
                System.out.println("successfully withdraw");
            }

        }

        @Override
        public void transfer(IAccount toAcc, int amt) {
            if(amt>this.balance){
                System.out.println("Insufficient balance");
                return;
            }
            else {
                this.balance-=amt;
                toAcc.deposit(amt);
                System.out.println("successfully transfer");
            }
        }

        @Override
        public int getAccountNumber() {
            return this.AccNumber;
        }
    public int getBalance() {
        return this.balance;
    }
}
