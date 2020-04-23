package contentCreation.Villians;

import contentCreation.Character.Character;
import contentCreation.Character.CharacterDecorator;

public class Tier2Villian extends CharacterDecorator {
    protected int teirLvL;

    public Tier2Villian(Character character) {
        super(character);
        super.setHealthPoints(500);
        teirLvL = 2;
    }

    public int getTeirLvL() {
        return teirLvL;
    }

    /**
     * will do return amount of 35 over all party members
     */
    @Override
    public int ability1() {
        return -55;
    }
    @Override
    public int ability2() {
        return -13 - (int) (.25 * (getCurrentLvl() + getTeirLvL()));
    }
}
