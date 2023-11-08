package Decorator;

public class DecoratorPattern {
    public static void main(String[] args) {
        WebPage basicWebPage = new BasicWebPage();
        System.out.println("simple content");
        basicWebPage.display();

        WebPage authorizedWebPage = new Split2multiPages(new AuthorizedUserDecorator(basicWebPage), 5);
        authorizedWebPage.display();


    }
}
