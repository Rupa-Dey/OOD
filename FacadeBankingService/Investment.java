package FacadeBankingService;

public class Investment implements IAccount{
    @Override
    public void operation() {
        System.out.println("money is invested");
    }
}
