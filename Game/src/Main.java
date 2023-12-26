import Menü.Menue;
import Methoden.AllMethods;

public class Main {
    public static void main(String[] args) {
        Menue menue = new Menue();
        AllMethods allMethods = new AllMethods(menue);
        menue.displayMenu();
        menue.handleSelection();
    }
}
