package Menü;
import Methoden.AllMethods;

import java.util.Scanner;


public class Menue {

    //AllMethods instanzierung durch Kunstroktor mann kann nicht einfach gegenseitig instanzieren bei 2 klassen sonst kommt circular dependency
    private AllMethods AllMethodsMenue;
    public Menue (AllMethods allMethods){
        this.AllMethodsMenue=allMethods;
    }
//--------------------------------------------------------------------

    public String[] MenueOptions = {"Start new Game", "Continue Game", "Save Game", "Quit Game"};

    public void displayMenu() {
        System.out.println("=== Game Menu ===");
        for (int i = 0; i < MenueOptions.length; i++) {
            System.out.println((i + 1) + ". " + MenueOptions[i]);
        }
    }

        public void handleSelection() {
            Scanner scanner = new Scanner(System.in);
            int userChoice = scanner.nextInt();
                switch (userChoice) {
                    case 1:
                        AllMethodsMenue.startNewGame();
                        break;
                    case 2:
                        AllMethodsMenue.continueGame();
                        break;
                    case 3:
                        AllMethodsMenue.saveGame();
                        break;
                    case 4:
                        AllMethodsMenue.quitGame();
                        break;
                    default:
                        System.out.println("Invalid option. Please choose a valid option.");


                }
        }



    }
