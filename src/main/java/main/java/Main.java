package main.java;
import contentCreation.Character.HydaelynInhabitantImpl;
import contentCreation.Character.Character;
import contentCreation.partyRoles.DpsDecorator;
import contentCreation.partyRoles.HealerDecorator;
import contentCreation.partyRoles.TankDecorator;
import gui.GameWindow;


public class Main {
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


        // Clone Bosses (4 Different Phases of the same boss that will get stronger each time / different moves)
        HydaelynInhabitantImpl Susano = new HydaelynInhabitantImpl("Susano", "Primal",
                "Othard", "Hingashi", "Ancient Kojin");


        /**
         *         implement random timer that may result in an attack
         *         Implement one Trial that gets stronger over and over
         */



        GameWindow test = new GameWindow();

        // Testing printing of of users to gui
        test.setGameLog(WarriorOfLight.getName());
        test.setGameLog(Mintella.toString());
        test.setGameLog(Luna.toString());
        test.setGameLog(Sulking.toString());
        test.setGameLog(Yshtola.toString());
        test.setGameLog(Susano.toString());






    }
}
