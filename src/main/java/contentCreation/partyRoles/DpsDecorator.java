package contentCreation.partyRoles;

import contentCreation.Character.CharacterDecorator;
import contentCreation.Character.Character;

public class DpsDecorator extends CharacterDecorator {

    public DpsDecorator(Character character) {
        super(character);
        super.setRole("DPS");
        super.setHealthPoints(40);
    }

    @Override
    public int ability1(){
        return 10 + (int) (.75*getCurrentLvl()+1);
    }

    @Override
    public int ability2(){
        return 8;
    }

    @Override
    public void rest(){
        setHealthPoints(getHealthPoints()+8);
    }
}
