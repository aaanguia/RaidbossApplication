package contentCreation.Character;

import contentCreation.worldSpawn.Hydaelyn;

public class HydaelynInhabitantImpl implements Character{
    private String name;
    private String race;
    private Hydaelyn homeLand;
    private String deity;        // Every Eorzean has a patron deity that often effects the type of person they are.

    public HydaelynInhabitantImpl(String Name, String race, String realm, String cityState, String deity ){
        name = Name;
        this.race = race;
        homeLand = new Hydaelyn(realm ,cityState);
        this.deity = deity;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public String getHomeLand() {
        return homeLand.toString();
    }

    public String getDeity() {
        return deity;
    }

    public String toString(){
        return getName() + ", of " + getHomeLand() + ". Follower of: " + getDeity();
    }

}
