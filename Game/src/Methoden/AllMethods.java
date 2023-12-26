package Methoden;

import Akteure.Objects;
import Akteure.Player;
import Menü.Menue;

import java.util.Scanner;

public class AllMethods {
    //initialiserung von Menue Klasse durch Konstruktor---------
    private Menue menue;
    public AllMethods(Menue menue) {
        this.menue = menue;
    }
//-------------------------------------------------------------
    private boolean characterCreated = false;

    public void startNewGame() {
        System.out.println("Starting a new game...");
        //checkt ob ein Character schon erstellt wurde
        if (characterCreated == true) {
            System.out.println("You already have created a character! Do you want to start completely new?");
        } else characterCreation();
    }

    public void continueGame() {
        System.out.println("Continuing the game...");
        inGameMenu();
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
        System.out.println("Alright " + playerUsername + ", you are ready for your adventure ! you are pretty bold for your " + playeruserAge + " years of Age\n always remember your Motto:" +
                playerMotto + ". Alright Good Luck ");
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
                    menue.displayMenu();

                    return;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }

    public void enterArena() {
        System.out.println("Do you want to enter the Arena to fight? type 1 for Yes and 2 for no");

        Scanner scanner = new Scanner(System.in); //für scanner einfach nur
        int ArenaChoice = scanner.nextInt();       // --


        switch (ArenaChoice) {
            case 1:
                arenaMenue();
                break;
            case 2:
                inGameMenu();

        }
    }
    public void arenaMenue(){}
    // Methode zur Berechnung des tatsächlichen Preises basierend auf der Intelligenz des Spielers


    public double calculateActualPrice(double playerIntelligence, Objects objects) {
        // Überprüfen, ob die Intelligenz im gültigen Bereich (0-100) liegt
        if (playerIntelligence < 0 || playerIntelligence > 100) {
            throw new IllegalArgumentException("Die Intelligenz muss im Bereich von 0 bis 100 liegen");
        }

        // Berechnung des Rabatts basierend auf der Intelligenz
        double discountPercentage = playerIntelligence / 100.0;

        // Berechnung des tatsächlichen Preises nach Anwendung des Rabatts
        double actualPrice = objects.basePrice- (objects.basePrice * discountPercentage);

        return actualPrice;
    }




    public void visitShop(){}
    public void  viewInventory(){}

    }
