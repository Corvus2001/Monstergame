package Methoden;

import java.util.Scanner;

public class AllMethods {
    private boolean characterCreated = false;

    public void startNewGame() {
        System.out.println("Starting a new game...");
        //checkt ob ein Character schon erstellt wurde
        if (characterCreated == true){
            System.out.println("You already have created a character! Do you want to start completely new?");
        }else characterCreation();}

    public void continueGame() {
        System.out.println("Continuing the game...");
        // Implementiere die Logik für das Fortsetzen des Spiels
    }
    public void saveGame() {
        System.out.println("Saving the game...");
        // Implementiere die Logik für das Speichern des Spiels
    }
    public void quitGame() {
        System.out.println("Quitting the game...");
        // Implementiere die Logik für das Beenden des Spiels
    }

    public void characterCreation() {
        //Alter Name und Motto wird eingelesen und abgespeichert
        Scanner scannerStartaNewGame = new Scanner(System.in);
        System.out.println("Enter your Name");
        String playerUsername = scannerStartaNewGame.nextLine();
        System.out.println("Enter your Age");
        int playeruserAge = scannerStartaNewGame.nextInt();
        //für bug fix
        scannerStartaNewGame.nextLine();
        //
        System.out.println("Enter your Motto");
        String playerMotto = scannerStartaNewGame.nextLine();
        System.out.println("Alright "+playerUsername+", you are ready for your adventure ! you are pretty bold for your "+playeruserAge+" years of Age\n always remember your Motto:" +
                playerMotto+ ". Alright Good Luck ");
        characterCreated = true;
        inGameMenu();

    }

    //inGameMenue
    public void inGameMenu() {
        if (!characterCreated) {
            System.out.println("You need to create a character first!");
            return;
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== In-Game Menu ===");
            System.out.println("1. Arena");
            System.out.println("2. Shop");
            System.out.println("3. Inventar");
            System.out.println("4. Back to Main Menu");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    enterArena();
                    break;
                case 2:
                    visitShop();
                    break;
                case 3:
                    viewInventory();
                    break;
                case 4:
                    System.out.println("Returning to Main Menu.");
                    return;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }
}
