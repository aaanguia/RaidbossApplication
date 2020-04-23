package main.java;
import contentCreation.Character.HydaelynInhabitantImpl;
import contentCreation.Character.Character;
import contentCreation.Villians.*;
import contentCreation.partyRoles.DpsDecorator;
import contentCreation.partyRoles.HealerDecorator;
import contentCreation.partyRoles.Party;
import contentCreation.partyRoles.TankDecorator;
import gui.GameWindow;


public class Main {
    public static Party heroParty;
    public static Party villianParty;
    public static Character SusanoTier1;
    public static Character SusanoTier2;
    public static Character SusanoTier3;
    public static Character SusanoTier4;
    public static Character SusanoTier5;

    public static void main(String[] args) {

        // Creating the Party of 5 for the Trial
        Character WarriorOfLight = new HealerDecorator( new HydaelynInhabitantImpl("Azumi Aki",
                "High Elf", "Eorzea", "Limsa Lominsa", "Azeyma"));

        Character Yshtola = new HealerDecorator( new HydaelynInhabitantImpl("Y'shtola Rhul", "Miqo'te",
                "Eorzea", "Sharlayan", "Thaliak"));

        Character Mintella = new TankDecorator( new HydaelynInhabitantImpl("GL Mintella", "Au'Ra",
                "Eorzea", "Gridania", "Nymeia"));

        Character Luna = new DpsDecorator( new HydaelynInhabitantImpl("Tarkus Jakuzure", "Xalean Au'Ra",
                "Eorzea", "Gridania", "Halone"));

        Character Sulking = new DpsDecorator(new  HydaelynInhabitantImpl("Sulking Lance", "Hell's Gaurd Roegadyn",
                "Eorzea", "Gridania", "Halone"));

        heroParty = new Party(WarriorOfLight, Yshtola, Mintella, Luna, Sulking);


        // Clone Bosses (5 Different Phases of the same boss that will get stronger each time / different moves)
        SusanoTier1 = new Tier1Villian( new HydaelynInhabitantImpl("Susano V1", "Primal",
                "Othard", "Hingashi", "Ancient Kojin"));
        SusanoTier2 = new Tier2Villian( new HydaelynInhabitantImpl("Susano V2", "Primal",
                "Othard", "Hingashi", "Ancient Kojin"));
        SusanoTier3 = new Tier3Villian(   new HydaelynInhabitantImpl("Susano V3", "Primal",
                "Othard", "Hingashi", "Ancient Kojin"));
        SusanoTier4 = new Tier4Villian(  new HydaelynInhabitantImpl("Susano V4", "Primal",
                "Othard", "Hingashi", "Ancient Kojin"));
        SusanoTier5 = new Tier5Villian( new HydaelynInhabitantImpl("Susano V5", "Primal",
                "Othard", "Hingashi", "Ancient Kojin"));

        villianParty = new Party(SusanoTier1, SusanoTier2, SusanoTier3, SusanoTier4, SusanoTier5);

        /**
         *         implement random timer that may result in an attack
         *         Implement one Trial that gets stronger over and over
         */

        GameWindow test = new GameWindow();

        // Adding Party Members to Log
        test.appendToPartyLog(WarriorOfLight);
        test.appendToPartyLog(Mintella);
        test.appendToPartyLog(Luna);
        test.appendToPartyLog(Sulking);
        test.appendToPartyLog(Yshtola);


    }
}
