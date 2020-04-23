package contentCreation.Villians;

import contentCreation.Character.Character;
import contentCreation.Character.CharacterDecorator;

public class Tier1Villian extends CharacterDecorator {
    protected int teirLvL;

    public Tier1Villian(Character character) {
        super(character);
        super.setHealthPoints(400);
        teirLvL = 1;
    }

    public int getTeirLvL() {
        return teirLvL;
    }

    /**
     * will do return amount of 35 over all party members
     */
    @Override
    public int ability1() {
        return -30;
    }
    @Override
    public int ability2() {
        return -8 - (int) (.25 * (getCurrentLvl() + getTeirLvL()));
    }



}
