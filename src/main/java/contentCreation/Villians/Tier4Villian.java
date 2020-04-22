package contentCreation.Villians;

import contentCreation.Character.Character;
import contentCreation.Character.CharacterDecorator;

public class Tier4Villian extends CharacterDecorator {
    protected int teirLvL;

    public Tier4Villian(Character character) {
        super(character);
        super.setHealthPoints(175);
        teirLvL = 4;
    }

    public int getTeirLvL() {
        return teirLvL;
    }

    /**
     * will do return amount of 35 over all party members
     */
    public int teamAttack(){
        return 41;
    }

    public int singleAttack(){
        return 15 + (int)(.25*(getCurrentLvl()+getTeirLvL()) + 0.25 );
    }
}
