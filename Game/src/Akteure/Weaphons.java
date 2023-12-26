package Akteure;

import Methoden.AllMethods;

public class Weaphons extends Objects {
    public Weaphons(){

        super();

        Weaphons standartWeaphon = new Weaphons();
        standartWeaphon.level = 1;
        standartWeaphon.name = "Standart Sword";
        standartWeaphon.basePrice = 10;

    }
    //Hier weitere Methoden für Waffen
    // neue StandartWaffe für den Player
    Weaphons standartWeaphon = new Weaphons();

}
