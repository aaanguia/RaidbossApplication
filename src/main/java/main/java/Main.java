package main.java;
import contentCreation.Character.HydaelynInhabitantImpl;
import gui.GameWindow;


public class Main {
    public static void main(String[] args) {
        // Creating the Party of 4 for the Trial
        HydaelynInhabitantImpl WarriorOfLight = new HydaelynInhabitantImpl("Azumi Aki", "High Elf",
                "Eorzea", "Limsa Lominsa", "Azeyma");

        HydaelynInhabitantImpl Mintella = new HydaelynInhabitantImpl("GL Mintella", "Au'Ra",
                "Eorzea", "Gridania", "Thalik");

        HydaelynInhabitantImpl Luna = new HydaelynInhabitantImpl("Tarkus Jakuzure", "Xalean Au'Ra",
                "Eorzea", "Gridania", "Halone");

        HydaelynInhabitantImpl SulkingLance = new HydaelynInhabitantImpl("Sulking Lance", "Hell's Gaurd Roegadyn",
                "Eorzea", "Gridania", "Halone");

        // Creating the 4 Trial Bosses
        HydaelynInhabitantImpl Titania = new HydaelynInhabitantImpl("Titania", "Faeri",
                "The First", "Norvandt", "Ancient Faeries");

        HydaelynInhabitantImpl Susano = new HydaelynInhabitantImpl("Susano", "Primal",
                "Othard", "Hingashi", "Ancient Kojin");

        HydaelynInhabitantImpl Bismarck = new HydaelynInhabitantImpl("Bismarck", "Primal",
                "Aldenard", "The Sea of Clouds", "Ancient Vanu Vanu");

        HydaelynInhabitantImpl Ifrit = new HydaelynInhabitantImpl("Ifrit", "Primal",
                "Aldenard", "Zanr'ak", "Ancient Amalj'aa.");










        GameWindow test = new GameWindow();

        // Testing printing of of users to gui
        test.setGameLog(WarriorOfLight.toString());
        test.setGameLog(Mintella.toString());
        test.setGameLog(Luna.toString());
        test.setGameLog(SulkingLance.toString());


        test.setGameLog(Titania.toString());
        test.setGameLog(Susano.toString());
        test.setGameLog(Bismarck.toString());
        test.setGameLog(Ifrit.toString());






    }
}
