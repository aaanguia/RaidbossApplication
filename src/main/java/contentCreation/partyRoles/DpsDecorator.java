package contentCreation.partyRoles;

import contentCreation.Character.HydaelynInhabitantImpl;
import contentCreation.Character.RoleDecorator;

public class DpsDecorator extends RoleDecorator {

    public DpsDecorator(HydaelynInhabitantImpl Character) {
        super(Character);
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
