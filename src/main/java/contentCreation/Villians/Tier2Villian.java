package contentCreation.Villians;

import contentCreation.Character.Character;
import contentCreation.Character.CharacterDecorator;

public class Tier2Villian extends CharacterDecorator {
    protected int teirLvL;

    public Tier2Villian(Character character) {
        super(character);
        super.setHealthPoints(125);
        teirLvL = 2;
    }

    public int getTeirLvL() {
        return teirLvL;
    }

    /**
     * will do return amount of 35 over all party members
     */
    public int teamAttack(){
        return 37;
    }

    public int singleAttack(){
        return 15 + (int)(.25*(getCurrentLvl()+getTeirLvL()) + 1 );
    }
}
