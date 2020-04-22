package contentCreation.partyRoles;

import contentCreation.Character.CharacterDecorator;
import contentCreation.Character.Character;

public class HealerDecorator extends CharacterDecorator {

    public HealerDecorator(Character character) {
        super(character);
        super.setRole("Healer");
    }

    public int partyHeal(){
        return 7 + (int)(.35 * getCurrentLvl() + 1);
    }

    public int healAttack(){
        return 3 + (int)(.15 * getCurrentLvl() + 1) ;
    }

    public void rest(){
        setHealthPoints(getHealthPoints()+ 10 + (int)(.05 * getCurrentLvl() + 1));
    }

}
