package contentCreation.Villians;

import contentCreation.Character.Character;
import contentCreation.Character.CharacterDecorator;

public class Tier3Villian extends CharacterDecorator {
    protected int teirLvL;

    public Tier3Villian(Character character) {
        super(character);
        super.setHealthPoints(150);
        teirLvL = 3;
    }

    public int getTeirLvL() {
        return teirLvL;
    }

    /**
     * will do return amount of 35 over all party members
     */
    public int teamAttack(){
        return 39;
    }

    public int singleAttack(){
        return 15 + (int)(.25*(getCurrentLvl()+getTeirLvL()) + 0.5 );
    }
}
