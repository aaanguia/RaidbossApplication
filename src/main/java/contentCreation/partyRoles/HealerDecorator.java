package contentCreation.partyRoles;

import contentCreation.Character.HydaelynInhabitantImpl;
import contentCreation.Character.RoleDecorator;

public class HealerDecorator extends RoleDecorator {

    public HealerDecorator(HydaelynInhabitantImpl Character) {
        super(Character);
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
