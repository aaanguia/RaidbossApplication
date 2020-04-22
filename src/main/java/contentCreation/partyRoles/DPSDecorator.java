package contentCreation.partyRoles;

import contentCreation.Character.Character;
import contentCreation.Character.HydaelynInhabitantImpl;
import contentCreation.worldSpawn.Hydaelyn;

public class DPSDecorator implements Character {
    protected HydaelynInhabitantImpl character;

    public DPSDecorator(HydaelynInhabitantImpl Character){
        this.character = character;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getRace() {
        return null;
    }

    @Override
    public String getHomeLand() {
        return null;
    }

    @Override
    public String getDeity() {
        return null;
    }
}
