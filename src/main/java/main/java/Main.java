package main.java;
import contentCreation.Character.HydaelynInhabitantImpl;
import gui.GameWindow;


public class Main {
    public static void main(String[] args) {

        // Creating the Party of 5 for the Trial
        HydaelynInhabitantImpl WarriorOfLight = new HydaelynInhabitantImpl("Azumi Aki", "High Elf",
                "Eorzea", "Limsa Lominsa", "Azeyma");

        HydaelynInhabitantImpl Mintella = new HydaelynInhabitantImpl("GL Mintella", "Au'Ra",
                "Eorzea", "Gridania", "Nymeia");

        HydaelynInhabitantImpl Luna = new HydaelynInhabitantImpl("Tarkus Jakuzure", "Xalean Au'Ra",
                "Eorzea", "Gridania", "Halone");

        HydaelynInhabitantImpl Sulking = new HydaelynInhabitantImpl("Sulking Lance", "Hell's Gaurd Roegadyn",
                "Eorzea", "Gridania", "Halone");

        HydaelynInhabitantImpl Yshtola = new HydaelynInhabitantImpl("Y'shtola Rhul", "Miqo'te",
                "Eorzea", "Sharlayan", "Thaliak");

        // Clone Bosses (4 Different Phases of the same boss that will get stronger each time / different moves)
        HydaelynInhabitantImpl Susano = new HydaelynInhabitantImpl("Susano", "Primal",
                "Othard", "Hingashi", "Ancient Kojin");





        /**
         *         implement random timer that may result in an attack
         *         Implement one Trial that gets stronger over and over
         */



        GameWindow test = new GameWindow();

        // Testing printing of of users to gui
        test.setGameLog(WarriorOfLight.toString());
        test.setGameLog(Mintella.toString());
        test.setGameLog(Luna.toString());
        test.setGameLog(Sulking.toString());
        test.setGameLog(Yshtola.toString());
        test.setGameLog(Susano.toString());






    }
}
