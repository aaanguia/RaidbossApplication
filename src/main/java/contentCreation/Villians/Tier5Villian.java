package contentCreation.Villians;

import contentCreation.Character.Character;
import contentCreation.Character.CharacterDecorator;

public class Tier5Villian extends CharacterDecorator {
    protected int teirLvL;

    public Tier5Villian(Character character) {
        super(character);
        super.setHealthPoints(3000);
        teirLvL = 4;
    }

    public int getTeirLvL() {
        return teirLvL;
    }

    /**
     * will do return amount of 35 over all party members
     */
    @Override
    public int ability1() {
        return -70;
    }
    @Override
    public int ability2() {
        return -20 - (int) (.25 * (getCurrentLvl() + getTeirLvL()));
    }
}