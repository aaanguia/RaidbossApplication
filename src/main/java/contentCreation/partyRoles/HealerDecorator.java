package contentCreation.partyRoles;

import contentCreation.Character.Character;
import contentCreation.Character.CharacterDecorator;


public class HealerDecorator extends CharacterDecorator {

    public HealerDecorator(Character character) {
        super(character);
        super.setRole("Healer");
        super.setHealthPoints(35);
    }
    @Override
    public int ability1(){
        return 10 + (int)(.35 * getCurrentLvl() + 1);
    }

    @Override
    public int ability2(){
        return 6 + (int)(.15 * getCurrentLvl() + 1) ;
    }

    @Override
    public void rest(){
        setHealthPoints(getHealthPoints()+ 10 + (int)(.05 * getCurrentLvl() + 1));
    }

}
