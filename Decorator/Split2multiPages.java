package Decorator;

class Split2multiPages extends WebPageDecorator{
    private int pageNumber;

    public Split2multiPages(WebPage decoratedPage, int pageNumber) {
        super(decoratedPage);
        this.pageNumber = pageNumber;
    }

    @Override
    public void display() {
        displaySearchResults();
        super.display();
    }

    private void displaySearchResults() {
        System.out.println("Displaying and showing Page " + pageNumber + " of Search Results");

    }
}
