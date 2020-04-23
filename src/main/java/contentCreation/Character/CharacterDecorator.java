package contentCreation.Character;

/**
 * abstract decorator
 */
public abstract class CharacterDecorator implements Character{
    protected Character character;

    public CharacterDecorator(Character character) {
        this.character = character;
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

    @Override
    public String getRole() {
        return character.getRole();
    }

    @Override
    public String toString(){
        return character.toString();
    }

    @Override
    public void setRole(String role) {
        character.setRole(role);
    }

    @Override
    public int getHealthPoints() {
        return character.getHealthPoints();
    }

    @Override
    public void setHealthPoints(int healthPoints) {
        character.setHealthPoints(healthPoints);
    }

    @Override
    public int getExperiencePoints() {
        return character.getExperiencePoints();
    }

    @Override
    public void setExperiencePoints(int experiencePoints) {
        character.setExperiencePoints(experiencePoints);
    }

    @Override
    public int getCurrentLvl() {
        return character.getCurrentLvl();
    }

    @Override
    public boolean isAlive() {
        return character.isAlive();
    }

    @Override
    public void setAlive(boolean alive) {
        character.setAlive(alive);
    }

    @Override
    public void setCurrentLvl() {
        character.setCurrentLvl();
    }

    @Override
    public int ability1() {
        return 0;
    }

    @Override
    public int ability2() {
        return 0;
    }

    @Override
    public void rest() {
    }
}
