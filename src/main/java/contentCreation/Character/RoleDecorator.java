package contentCreation.Character;

import contentCreation.Character.Character;
import contentCreation.Character.HydaelynInhabitantImpl;

public class RoleDecorator implements Character {
    protected HydaelynInhabitantImpl character;
    protected String role;
    protected boolean isAlive;
    protected int currentLvl;
    protected int healthPoints;
    protected int experiencePoints;

    public RoleDecorator(HydaelynInhabitantImpl Character){
        this.character = Character;
        currentLvl = 1;
        role = "DPS";
        healthPoints = 50;
        experiencePoints = 0;
    }

    @Override
    public String getName() {
        return character.getName();
    }

    @Override
    public String getRace() {
        return character.getRace();
    }

    @Override
    public String getHomeLand() {
        return character.getHomeLand();
    }

    @Override
    public String getDeity() {
        return character.getDeity();
    }

    public String getRole() {
        return role;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public int getCurrentLvl() {
        return currentLvl;
    }

    public boolean isAlive() {
        if(getHealthPoints() <= 0){
            setAlive(false);
        }
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void setCurrentLvl() {
        if(getExperiencePoints() > 30){
            currentLvl++;
            setExperiencePoints(getExperiencePoints()%30);
        }
    }

}
