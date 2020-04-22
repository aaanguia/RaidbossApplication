package contentCreation.partyRoles;

import contentCreation.Character.CharacterDecorator;
import contentCreation.Character.Character;

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

    public int slash(){
        return 7 + (int) (.35 * getCurrentLvl() +2);
    }

    public void rest(){
        setHealthPoints(getHealthPoints()+ 9 + (int) (0.15 * getCurrentLvl() + 1));
    }
}
