package contentCreation.partyRoles;

import contentCreation.Character.Character;
import contentCreation.Character.CharacterDecorator;

public class TankDecorator extends CharacterDecorator {
    protected boolean grit;  // Tank ability to soak damage for party.

    public TankDecorator(Character character) {
        super(character);
        super.setHealthPoints(75);
        super.setRole("Tank");
        grit = true;
    }

    public boolean isGrit() {
        return grit;
    }

    public void setGrit(boolean grit) {
        this.grit = grit;
    }

    public void toggleGrit(){
        setGrit(!isGrit());
    }

    @Override
    public int ability1(){
        return 4 + (int) (.35 * getCurrentLvl() +2);
    }

    @Override
    public int ability2(){
        return ability1();
    }

    @Override
    public void rest(){
        setHealthPoints(getHealthPoints()+ 9 + (int) (0.15 * getCurrentLvl() + 1));
    }
}
