import Menü.Menue;

public class Main {
    public static void main(String[] args) {
        Menue MenueMain = new Menue();
        MenueMain.displayMenu();
        MenueMain.handleSelection();
    }
}