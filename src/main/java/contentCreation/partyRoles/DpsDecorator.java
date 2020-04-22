package contentCreation.partyRoles;

import contentCreation.Character.CharacterDecorator;
import contentCreation.Character.Character;

public class DpsDecorator extends CharacterDecorator {

    public DpsDecorator(Character character) {
        super(character);
        super.setRole("DPS");
    }

    public int dashAttack(){
        return 10 + (int) (.75*getCurrentLvl()+1);
    }

    public int strongAttack(){
        return 15;
    }

    public void rest(){
        setHealthPoints(getHealthPoints()+8);
    }
}
