package contentCreation.Villians;

import contentCreation.Character.Character;
import contentCreation.Character.CharacterDecorator;

public class Tier4Villian extends CharacterDecorator {
    protected int teirLvL;

    public Tier4Villian(Character character) {
        super(character);
        super.setHealthPoints(1500);
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
        return -65;
    }
    @Override
    public int ability2() {
        return -15 - (int) (.25 * (getCurrentLvl() + getTeirLvL()));
    }
}
