package contentCreation.partyRoles;

import contentCreation.Character.Character;

import java.util.ArrayList;

public class Party {
    protected ArrayList<Character> party;

    public Party(Character c1, Character c2, Character c3, Character c4, Character c5  ){
        party = new ArrayList<Character>();
        party.add(c1);
        party.add(c2);
        party.add(c3);
        party.add(c4);
        party.add(c5);
    }

    public ArrayList<Character> sendParty(){
        return party;
    }

    public boolean isPartyAlive(){
        for(Character c: party){
            if(c.isAlive()){
                return true;
            }
        }

        return false;
    }
}


