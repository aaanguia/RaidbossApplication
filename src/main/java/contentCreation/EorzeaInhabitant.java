package contentCreation;

import contentCreation.worldSpawn.Hydaelyn;

public class EorzeaInhabitant {
    private String name;
    private String race;
    private Hydaelyn homeLand;
    private String deity;        // Every Eorzean has a patron deity that often effects the type of person they are.

    public EorzeaInhabitant(String Name, String race, String origin, String cityState, String deity ){
        name = Name;
        homeLand = new Hydaelyn(origin ,cityState);
        this.deity = deity;
    }

    public String getRace() {
        return race;
    }

    public Hydaelyn getHomeLand() {
        return homeLand;
    }

    public String getDeity() {
        return deity;
    }

    public String getName() {
        return name;
    }

}
