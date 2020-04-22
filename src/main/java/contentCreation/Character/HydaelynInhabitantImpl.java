package contentCreation.Character;

import contentCreation.worldSpawn.Hydaelyn;

public class HydaelynInhabitantImpl implements Character{
    private final String name;
    private final String race;
    private final Hydaelyn homeLand;
    private final String deity;        // Every Eorzean has a patron deity that often effects the type of person they are.
    protected String role;
    protected boolean isAlive;
    protected int currentLvl;
    protected int healthPoints;
    protected int experiencePoints;

    public HydaelynInhabitantImpl(String Name, String race, String realm, String cityState, String deity ){
        name = Name;
        this.race = race;
        homeLand = new Hydaelyn(realm ,cityState);
        this.deity = deity;
        role = "";
        isAlive = true;
        currentLvl = 1;
        healthPoints = 20;
        experiencePoints = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRace() {
        return race;
    }

    @Override
    public String getHomeLand() {
        return homeLand.toString();
    }

    @Override
    public String getDeity() {
        return deity;
    }

    @Override
    public String toString(){
        return getName() + ", of " + getHomeLand() + ". Follower of: " + getDeity();
    }

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public int getHealthPoints() {
        return healthPoints;
    }

    @Override
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    @Override
    public int getExperiencePoints() {
        return experiencePoints;
    }

    @Override
    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    @Override
    public int getCurrentLvl() {
        return currentLvl;
    }

    @Override
    public boolean isAlive() {
        if(getHealthPoints() <= 0){
            setAlive(false);
        }
        return isAlive;
    }

    @Override
    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public void setCurrentLvl() {
        if(getExperiencePoints() > 30){
            currentLvl++;
            setExperiencePoints(getExperiencePoints()%30);
        }
    }

}
