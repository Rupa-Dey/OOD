package FacadeBankingService;

public class Saving implements IAccount{
    @Override
    public void operation() {
        System.out.println("Saving Operation is performed");
    }
}
