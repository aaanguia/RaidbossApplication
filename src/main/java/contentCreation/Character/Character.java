package contentCreation.Character;

public interface Character {
    String getName();
    String getRace();
    String getHomeLand();
    String getDeity();
    String getRole();
    String toString();
    void setRole(String role);
    int getHealthPoints();
    void setHealthPoints(int healthPoints);
    int getExperiencePoints();
    void setExperiencePoints(int experiencePoints);
    int getCurrentLvl();
    boolean isAlive();
    void setAlive(boolean alive);
    void setCurrentLvl();
    int ability1();
    int ability2();
    void rest();
}
