package contentCreation.Villians;

import contentCreation.Character.Character;
import contentCreation.Character.CharacterDecorator;

public class Tier5Villian extends CharacterDecorator {
    protected int teirLvL;

    public Tier5Villian(Character character) {
        super(character);
        super.setHealthPoints(200);
        teirLvL = 4;
    }

    public int getTeirLvL() {
        return teirLvL;
    }

    /**
     * will do return amount of 35 over all party members
     */
    public int teamAttack() {
        return 43;
    }

    public int singleAttack() {
        return 15 + (int) (.25 * (getCurrentLvl() + getTeirLvL()));
    }
}