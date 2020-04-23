package contentCreation.Villians;

import contentCreation.Character.Character;
import contentCreation.Character.CharacterDecorator;

public class Tier3Villian extends CharacterDecorator {
    protected int teirLvL;

    public Tier3Villian(Character character) {
        super(character);
        super.setHealthPoints(1000);
        teirLvL = 3;
    }

    public int getTeirLvL() {
        return teirLvL;
    }

    /**
     * will do return amount of 35 over all party members
     */
    @Override
    public int ability1() {
        return -60;
    }
    @Override
    public int ability2() {
        return -15 - (int) (.25 * (getCurrentLvl() + getTeirLvL()));
    }
}
