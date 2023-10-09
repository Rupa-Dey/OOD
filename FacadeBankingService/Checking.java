package FacadeBankingService;

public class Checking implements IAccount {


    @Override
    public void operation() {
        System.out.println("money is checked in");
    }
}
