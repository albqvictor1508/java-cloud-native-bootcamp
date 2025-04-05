package classes;

public class Browser {
    private int tabs = 0;

    public void showPage() {
        System.out.println("Showing page");
    }

    public void addNewTab() {
        this.tabs++;
        System.out.println("new tab added!");
    }

    public void refreshPage() {
        System.out.println("page refreshed");
    }
}
