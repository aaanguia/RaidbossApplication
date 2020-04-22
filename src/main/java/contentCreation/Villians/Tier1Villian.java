package contentCreation.Villians;

import contentCreation.Character.Character;
import contentCreation.Character.CharacterDecorator;

public class Tier1Villian extends CharacterDecorator {
    protected int teirLvL;

    public Tier1Villian(Character character) {
        super(character);
        super.setHealthPoints(100);
        teirLvL = 1;
    }

    public int getTeirLvL() {
        return teirLvL;
    }

    /**
     * will do return amount of 35 over all party members
     */
    public int teamAttack(){
        return 35;
    }

    public int singleAttack(){
        return 15 + (int)(.25*(getCurrentLvl()+getTeirLvL()) + 1 );
    }



}
