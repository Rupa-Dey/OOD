package Decorator;

class AuthorizedUserDecorator extends WebPageDecorator{
    public AuthorizedUserDecorator(WebPage decoratedPage) {
        super(decoratedPage);
    }
    @Override
    public void display() {
        checkAuthorization();
        super.display();
    }

    private void checkAuthorization() {
        System.out.println("authorization checking");

    }
}
